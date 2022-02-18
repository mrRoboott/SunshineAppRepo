package com.example.courseapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.tv_weather_data);
        String[] weathers = {
                "დღეს, 17 მაისი, მზიანი ამინდი - 17°C / 15°C",
                "ხვალ - ღრუბლიანი ამინდი - 19°C / 15°C ",
                "ხუთშაბათი - წვიმიანი- 30°C / 11°C",
                "პარასკევი - ქარიშხალი - 21°C / 9°C",
                "შაბათი - ქარიშხალი - 16°C / 7°C",
                "კვირა - წვიმიანი - 16°C / 8°C",
                "ორშ - ნაწილობრივ ღრუბლიანი - 15°C / 10°C",
                "სამშ, მაისი 24 - წვიმიანი - 16°C / 18°C",
                "ოთხშ, მაისი 25 - ღრუბლიანი - 19°C / 15°C",
                "ხუთ, მაისი 26 - შტორმი - 30°C / 11°C",
                "პარ, მაისი 27 - ღრუბლიანი - 21°C / 9°C",
                "შაბ, მაისი 28 - მეტეორები - 16°C / 7°C",
                "კვ, მაისი 29 - აპოკალიპსი - 16°C / 8°C",
                "ორშ, მაისი 30 - ღრუბლიანი - 15°C / 10°C",
        };
        for(String weather:weathers){
            textView.append(weather + "\n\n\n");
        }
    }
}