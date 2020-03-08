/**
 * 
 */
package cn.segema.security.demo.dto;

/**
 * @author wangyong
 *
 */
public class FileInfo {
	
	public FileInfo(String path){
		this.path = path;
	}
	
	private String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
