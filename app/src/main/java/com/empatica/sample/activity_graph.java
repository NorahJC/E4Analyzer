package com.empatica.sample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;




public class activity_graph extends AppCompatActivity {

    //private LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        // get graph view instance
        GraphView graph = (GraphView) findViewById(R.id.graph);
        // data
        // graph.addSeries(series);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(-2, 3),
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 4),
                new DataPoint(4, 2),
                new DataPoint(5, 6),
                new DataPoint(6, 4),
        });
        graph.addSeries(series);
        // styling series
        series.setTitle("HR");
        series.setColor(Color.GREEN);

//        // get graph view instance
//        GraphView graph2 = (GraphView) findViewById(R.id.graph2);
//        // data
//        LineGraphSeries<DataPoint> series2 = new LineGraphSeries<>(new DataPoint[] {
//                new DataPoint(-1, 0),
//                new DataPoint(0, 6),
//                new DataPoint(-4, 3)
//        });
//        graph2.addSeries(series2);
//        // styling series
//        series2.setTitle("EDA");
//        series2.setColor(Color.RED);

//        graph.setTitle("Biofeedback Data");

    }
}