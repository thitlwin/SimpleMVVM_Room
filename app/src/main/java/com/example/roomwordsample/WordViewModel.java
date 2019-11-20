package com.example.roomwordsample;

import android.app.Application;
import android.app.ListActivity;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {
    WordRepository mWordRepository;
    LiveData<List<Word>> mAllWord;
    public WordViewModel(@NonNull Application application) {
        super(application);
        mWordRepository = new WordRepository(application);
        mAllWord = mWordRepository.getAllWord();
    }

    LiveData<List<Word>> getAllWord() {
        return mAllWord;
    }

    public void insert(Word word) {
        mWordRepository.insert(word);
    }
}
