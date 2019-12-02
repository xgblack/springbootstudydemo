package cn.xgblack.fileupload_demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * @author xg BLACK
 * @date 2019/12/2 17:14
 * description:
 */
@ControllerAdvice
public class MyCustomException {
    /*@ExceptionHandler(MaxUploadSizeExceededException.class)
    public void myexecption(MaxUploadSizeExceededException e, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.write("上传文件大小超出限制");
        out.flush();
        out.close();
    }*/
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ModelAndView myexecption(MaxUploadSizeExceededException e) throws IOException {
        ModelAndView mv = new ModelAndView("myerror");
        mv.addObject("error", "文件上传大小超出限制");
        return mv;
    }
}
