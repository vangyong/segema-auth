package cn.sgema.security.app.support;

/**
 * @author wangyong
 *
 */
public class SimpleResponse {

	public SimpleResponse(Object content) {
		this.content = content;
	}

	private Object content;

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

}
