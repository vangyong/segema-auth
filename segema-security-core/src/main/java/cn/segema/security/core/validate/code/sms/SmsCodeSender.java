package cn.segema.security.core.validate.code.sms;

/**
 * @author wangyong
 *
 */
public interface SmsCodeSender {
	
	void send(String mobile, String code);

}
