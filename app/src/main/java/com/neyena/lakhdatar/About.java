package com.neyena.lakhdatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class About extends AppCompatActivity {
    TextView aboutDesc, kathaDesc, nishanDesc, ekaDesc, DwaDesc, melaDesc, niyamDesc, yatraDesc;
    LinearLayout colLayout, kathaLayout, nishanLayout, ekadLayout, DwadLayout, melaLayout, niyamLayout, yatraLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        aboutDesc= findViewById(R.id.about_desc);
        colLayout= findViewById(R.id.about_collaps);
        kathaDesc= findViewById(R.id.katha_desc);
        kathaLayout= findViewById(R.id.katha_collaps);
        nishanDesc= findViewById(R.id.nishan_desc);
        nishanLayout=findViewById(R.id.nishan_collaps);
        ekaDesc= findViewById(R.id.Ekadashi_desc);
        ekadLayout= findViewById(R.id.Ekadashi_collaps);
        DwaDesc= findViewById(R.id.Dwadashi_desc);
        DwadLayout= findViewById(R.id.Dwadashi_collaps);
        melaDesc= findViewById(R.id.Mela_desc);
        melaLayout= findViewById(R.id.Mela_collaps);
        niyamDesc= findViewById(R.id.Niyam_desc);
        niyamLayout= findViewById(R.id.Niyam_collaps);
        yatraDesc= findViewById(R.id.Yatra_desc);
        yatraLayout= findViewById(R.id.Yatra_collaps);
    }

    public void aexpand(View view) {
        boolean isAboutDescVisible = aboutDesc.getVisibility() == View.VISIBLE;
        int aboutVisibility = isAboutDescVisible ? View.GONE : View.VISIBLE;
        TransitionManager.beginDelayedTransition(colLayout, new AutoTransition());
        aboutDesc.setVisibility(aboutVisibility);
    }
    public void kexpand(View view) {
        boolean isKathaDescVisible = kathaDesc.getVisibility() == View.VISIBLE;
        int kathaVisibility = isKathaDescVisible ? View.GONE : View.VISIBLE;
        TransitionManager.beginDelayedTransition(kathaLayout, new AutoTransition());
        kathaDesc.setVisibility(kathaVisibility);
    }
    public void nishaexpand(View view) {
        boolean isNishanDescVisible = nishanDesc.getVisibility() == View.VISIBLE;
        int nishanVisibility = isNishanDescVisible ? View.GONE : View.VISIBLE;
        TransitionManager.beginDelayedTransition(nishanLayout, new AutoTransition());
        nishanDesc.setVisibility(nishanVisibility);
    }
    public void Ekadexpand(View view) {
        boolean isEkaDescVisible = ekaDesc.getVisibility() == View.VISIBLE;
        int ekaVisibility = isEkaDescVisible ? View.GONE : View.VISIBLE;
        TransitionManager.beginDelayedTransition(ekadLayout, new AutoTransition());
        ekaDesc.setVisibility(ekaVisibility);
    }
    public void Dwadexpand(View view) {
        boolean isDwaDescVisible = DwaDesc.getVisibility() == View.VISIBLE;
        int dwaVisibility = isDwaDescVisible ? View.GONE : View.VISIBLE;
        TransitionManager.beginDelayedTransition(DwadLayout, new AutoTransition());
        DwaDesc.setVisibility(dwaVisibility);
    }
    public void Melaexpand(View view) {
        boolean isMelaDescVisible = melaDesc.getVisibility() == View.VISIBLE;
        int melaVisibility = isMelaDescVisible ? View.GONE : View.VISIBLE;
        TransitionManager.beginDelayedTransition(melaLayout, new AutoTransition());
        melaDesc.setVisibility(melaVisibility);
    }
    public void Niyamexpand(View view) {
        boolean isNiyamDescVisible = niyamDesc.getVisibility() == View.VISIBLE;
        int niyamVisibility = isNiyamDescVisible ? View.GONE : View.VISIBLE;
        TransitionManager.beginDelayedTransition(niyamLayout, new AutoTransition());
        niyamDesc.setVisibility(niyamVisibility);
    }
    public void Yatraexpand(View view) {
        boolean isYatraDescVisible = yatraDesc.getVisibility() == View.VISIBLE;
        int yatraVisibility = isYatraDescVisible ? View.GONE : View.VISIBLE;
        TransitionManager.beginDelayedTransition(yatraLayout, new AutoTransition());
        yatraDesc.setVisibility(yatraVisibility);
    }
}
