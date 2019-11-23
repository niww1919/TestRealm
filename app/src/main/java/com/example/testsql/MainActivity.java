package com.example.testsql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Timer;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textViewTimer;
    Button startButton;
    Button stopButton;
    Timer timer;
    LinearLayout linearLayout;
    Calendar calendar;
    Long result;
    Integer resultInt;
    long startTimer;
    long stopTimer;
    long resultOfTimer;
    TimerDB timerDB2;
    TimerDB timerDB3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Draw draw = new Draw(this);


        textView = findViewById(R.id.timer);
        textViewTimer = new TextView(this);
        linearLayout = findViewById(R.id.ll);
        startButton = new Button(this);
        stopButton = new Button(this);
        calendar = Calendar.getInstance();
        final int second = calendar.get(Calendar.SECOND);
        final long timeInMillis = calendar.getTimeInMillis();

        startButton.setText("Start");
        stopButton.setText("Stop");
        textView.setText("Timer");
        linearLayout.addView(startButton);
        linearLayout.addView(stopButton);

        /*Realm*/

        final TimerDB timerDB = new TimerDB();
        TimerDB timerDB1 = new TimerDB();
        timerDB.setTimeOfTraining(1);
//        timerDB.setDate(3);

        Realm.init(this);
//        Realm realm = Realm.getDefaultInstance();
        RealmConfiguration config = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(config);


//        realm.executeTransaction(new Realm.Transaction() {
//            @Override
//            public void execute(Realm realm) {
//
//                timerDB3 = realm.createObject(TimerDB.class);
//                timerDB3.setValue(4363);
//
//            }
//        });



//        final RealmResults<TimerDB> vall = realm.where(TimerDB.class)
//                .lessThan("val", 30)
//                .findAll();


        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                setContentView(draw);

                startTimer = System.currentTimeMillis();
//                startTimer = new Date(System.currentTimeMillis());

            }
        });
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                    result = second - myTimerClass.timeInTimer;
//                    resultInt = result != null :result.intValue ( ) ?  null ;
//                    resultInt = result.intValue ( );
//                    stopTimer = calendar.get(Calendar.SECOND);
//                    stopTimer = new Date(System.currentTimeMillis());
                    stopTimer = System.currentTimeMillis();
                    resultOfTimer = stopTimer - startTimer;
                    textView.setText(String.valueOf(resultOfTimer));


//                    realm.beginTransaction();
//                    timerDB.setValue(resultOfTimer);
//                    realm.commitTransaction();
//                    realm.executeTransaction(new Realm.Transaction() {
//                        @Override
//                        public void execute(Realm realm) {
//                            timerDB1 = realm.createObject(TimerDB.class);
//                            timerDB1.setValue(resultOfTimer);
//                        }
//                    });



            }
        });

        textViewTimer.setText(String.valueOf(timerDB.getTimeOfTraining()));
        linearLayout.addView(textViewTimer);

    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

//    class MyTimerClass extends TimerTask {
//           public long timeInTimer;
//        @Override
//        public void run() {
//            timeInTimer = calendar.get(Calendar.SECOND);
//
//        }
}

//    class MySQlite extends SQLiteOpenHelper {
//
//        public static final String TABLE_NAME = "TIME";
//        public static final String VALUE_OF_TIMER = "VALUE";
//        public MySQlite(@androidx.annotation.Nullable Context context, @androidx.annotation.Nullable String name, @androidx.annotation.Nullable SQLiteDatabase.CursorFactory factory, int version) {
//            super ( context, name, factory, version );
//        }
//
//        @Override
//        public void onCreate(SQLiteDatabase db) {
//
//        }
//
//        @Override
//        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//        }
//    }

//    class db extends RealmObject(){
//
//
//
//    }



