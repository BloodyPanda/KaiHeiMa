package com.kaiheima;

public class News {
	private String NewsTitle;       //���ű���
	private String NewsContent;     //��������
	private String NewsImage;       //����ͼƬ
	
	public News(){
		
	}
	
	public String getNewsTitle() {
		return NewsTitle;
	}
	public void setNewsTitle(String NewsTitle) {
		this.NewsTitle = NewsTitle;
	}
	
	public String getNewsContent() {
		return NewsContent;
	}
	public void setNewsContent(String NewsContent) {
		this.NewsContent = NewsContent;
	}
	
	public String getNewsImage() {
		return NewsImage;
	}
	public void setNewsImage(String NewsImage) {
		this.NewsImage = NewsImage;
	}
}
