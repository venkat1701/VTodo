package io.github.venkat1701.vtodo.service;

import com.google.gson.Gson;
import io.github.venkat1701.vtodo.dao.QuoteDao;
import io.github.venkat1701.vtodo.request.HttpSendRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Generates Quotes and adds them to the List.
 *
 * @author Venkat
 * @since 1.0
 */
public class QuoteService {

    @Getter
    @Setter
    private List<String> quotes;

    public QuoteService() {
        quotes = new ArrayList<>();
        this.createQuotes();
    }

    public void createQuotes() {

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                var gson = new Gson();
                quotes.add(gson.fromJson(HttpSendRequest.sendRequest(), QuoteDao.class).getContent());
            }
        }, 1000);
    }
}
