package br.marcosrichard.desafiozup.modells;


public class Response {
    private Integer code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private String etag;
    private PageData data;

    public Response(Integer code, String status, String copyright, String attributionText, String attributionHTML, String etag, PageData data) {
        this.code = code;
        this.status = status;
        this.copyright = copyright;
        this.attributionText = attributionText;
        this.attributionHTML = attributionHTML;
        this.etag = etag;
        this.data = data;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public String getEtag() {
        return etag;
    }

    public Integer getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public PageData getData() {
        return data;
    }
}
