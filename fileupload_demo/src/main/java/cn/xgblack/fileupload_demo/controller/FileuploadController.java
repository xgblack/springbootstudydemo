package cn.xgblack.fileupload_demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author xg BLACK
 * @date 2019/12/2 16:04
 * description:
 */
@RestController
public class FileuploadController {

    SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");

    @PostMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest request) {
        String format = sdf.format(new Date());
        String realPath = request.getServletContext().getRealPath("/img") + format;
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String oldName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
        try {
            file.transferTo(new File(folder,newName));
            String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/img" + format + newName;
            return url;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }

    @PostMapping("/uploads")
    public String uploads(MultipartFile[] files, HttpServletRequest request) {
        String format = sdf.format(new Date());
        String realPath = request.getServletContext().getRealPath("/img") + format;
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        for (MultipartFile file : files) {
            String oldName = file.getOriginalFilename();
            String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
            try {
                file.transferTo(new File(folder,newName));
                String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/img" + format + newName;
                System.out.println(url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "success";
    }
}
