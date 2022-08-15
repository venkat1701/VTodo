package io.github.venkat1701.vtodo.dao;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
public class QuoteDao {

    @SerializedName("content")
    @Getter @Setter
    private String content;
    public QuoteDao() {

    }

}
