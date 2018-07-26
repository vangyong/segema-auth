package cn.segema.security.core.validate.code;


import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author wangyong
 *
 */
public interface ValidateCodeGenerator {

	ValidateCode generate(ServletWebRequest request);
	
}
