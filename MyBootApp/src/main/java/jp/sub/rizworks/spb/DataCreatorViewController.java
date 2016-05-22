package jp.sub.rizworks.spb;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class DataCreatorViewController {
	
	final static Logger logger = LoggerFactory.getLogger(DataCreatorViewController.class);

//	@RequestMapping(value = "/init", method = RequestMethod.GET)
//	@RequestMapping("/init")
//	  public String init(Model model) {
//		ArrayList<ViewData> list = new ArrayList<ViewData>();
//        for (int i = 0; i < 5; i++) {
//            ViewData data = new ViewData();
//            StringBuffer buffer = new StringBuffer();
//            buffer.append("message");
//            buffer.append(i);
//            data.setNo(i + 1);
//            data.setMessage(buffer.toString());
//            list.add(data);
//        }
// 
//        model.addAttribute("msg", list);
//        return "index";
//	  }

	@RequestMapping(value = "/init", method = RequestMethod.GET)
	  public String index(Model model) {
	    logger.debug("Actor + index");
		ArrayList<ViewData> list = new ArrayList<ViewData>();
      for (int i = 0; i < 5; i++) {
          ViewData data = new ViewData();
          StringBuffer buffer = new StringBuffer();
          buffer.append("message");
          buffer.append(i);
          data.setNo(i + 1);
          data.setMessage(buffer.toString());
          list.add(data);
      }
	    model.addAttribute("list", list);
//	    modelDump(model, "index");
	    return "index";
	  }
	
	class ViewData {
	    private int no;
	    private String message;
	 
	    public int getNo() {
	        return no;
	    }
	 
	    public void setNo(int no) {
	        this.no = no;
	    }
	 
	    public String getMessage() {
	        return message;
	    }
	 
	    public void setMessage(String message) {
	        this.message = message;
	    }
	 
	    public String toString() {
	        return message;
	    }
	}
}
