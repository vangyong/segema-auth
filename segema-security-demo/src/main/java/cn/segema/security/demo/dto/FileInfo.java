/**
 * 
 */
package cn.segema.security.demo.dto;

/**
 * @author vangyong@126.com
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
