package br.marcosrichard.desafiozup.modells;

import java.util.List;

public class PageData {
    private Integer offset;
    private Integer limit;
    private Integer total;
    private Integer count;
    private List<Comics> results;

    public PageData(Integer offset, Integer limit, Integer total, Integer count, List<Comics> results) {
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.count = count;
        this.results = results;
    }

    public Integer getOffset() {
        return offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getCount() {
        return count;
    }

    public List<Comics> getResults() {
        return results;
    }
}
