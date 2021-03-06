package com.app.tabletopdiceroller.async;

import android.os.AsyncTask;
import com.app.tabletopdiceroller.Objects.Roll;
import com.app.tabletopdiceroller.room.RollDAO;

/**
 * Async task: Executes a single job on a background thread.
 * This class allows us to perform the database operation in the background
 */
public class InsertAsyncTask extends AsyncTask<Roll, Void, Void> {

    private RollDAO rollDao;

    public InsertAsyncTask(RollDAO dao) {
        rollDao = dao;
    }

    /**
     * Inserts the passed in list of rolls into the database table
     * @param rolls is the list of rolls to be inserted
     * @return null
     */
    @Override
    protected Void doInBackground(Roll... rolls) {
        rollDao.insertRolls(rolls);
        return null;
    }
}
