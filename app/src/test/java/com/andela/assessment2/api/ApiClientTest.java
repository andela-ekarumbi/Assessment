package com.andela.assessment2.api;

import com.andela.assessment2.model.Book;
import com.andela.assessment2.model.BookListResult;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static org.junit.Assert.*;

/**
 * Created by Eston on 13/01/2017.
 */
public class ApiClientTest {

    MockWebServer mockWebServer;

    BookListResult testResult;

    @Before
    public void setUp() throws Exception {
        mockWebServer = new MockWebServer();
        mockWebServer.start();
        mockWebServer.enqueue(new MockResponse()
                .setResponseCode(200)
        .setBody(getTestJson()));
    }

    @Test
    public void testGetBestSellerHistoryList() throws Exception {
        new ApiClient().getBestSellerHistoryList(new Callback<BookListResult>() {
            @Override
            public void onResponse(Call<BookListResult> call, Response<BookListResult> response) {
                testResult = response.body();
            }

            @Override
            public void onFailure(Call<BookListResult> call, Throwable t) {

            }
        });
        Thread.sleep(500);
        assertNotNull(testResult);
        List<Book> books = testResult.getBooks();
        assertEquals(3, books.size());
    }

    private String getTestJson() throws IOException {
        InputStream is = new FileInputStream("test_list.json");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
        StringBuilder builder = new StringBuilder();
        String textLine = bufferedReader.readLine();
        while (textLine != null) {
            builder.append(textLine);
            textLine = bufferedReader.readLine();
        }
        return builder.toString();
    }

}