package com.rise.grk.patentapp;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.rise.grk.patentapp.Fragments.EnterFragment;
import com.rise.grk.patentapp.Fragments.LibraryFragment;
import com.rise.grk.patentapp.Fragments.PatentFragment;
import com.rise.grk.patentapp.Fragments.SettingsFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static final int GROUP_A = 0;
    public static final int GROUP_B = 1;
    public static final int GROUP_C = 2;
    public static final int GROUP_D = 3;
    public static final int GROUP_E = 4;
    public static final int GROUP_F = 5;
    public static final int GROUP_G = 6;
    public static final int GROUP_H = 7;
    public static final int SETTINGS = 8;



    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fragmentManager = getSupportFragmentManager();
        EnterFragment enterFragment = new EnterFragment();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//        fragmentTransaction.setCustomAnimations(R.animator.slide_in_left, R.animator.slide_in_right);
        fragmentTransaction.replace(R.id.fragment, enterFragment);

        fragmentTransaction.commit();

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            changeFragment(SETTINGS);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.group_a) {
            changeFragment(GROUP_A);

        } else if (id == R.id.group_b) {
            changeFragment(GROUP_B);

        } else if (id == R.id.group_c) {
            changeFragment(GROUP_C);

        } else if (id == R.id.group_d) {
            changeFragment(GROUP_D);

        } else if (id == R.id.group_e) {
            changeFragment(GROUP_E);

        } else if (id == R.id.group_f) {
            changeFragment(GROUP_F);

        } else if (id == R.id.group_g) {
            changeFragment(GROUP_G);

        } else if (id == R.id.group_h) {
            changeFragment(GROUP_H);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void changeFragment(int fragment){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        switch (fragment){
            case GROUP_A:
                fragmentTransaction.replace(R.id.fragment, LibraryFragment.newInstance())
                        .addToBackStack(String.valueOf(R.id.fragment));
                break;
            case GROUP_B:
                fragmentTransaction.replace(R.id.fragment, LibraryFragment.newInstance())
                        .addToBackStack(String.valueOf(R.id.fragment));
                break;
            case GROUP_C:
                fragmentTransaction.replace(R.id.fragment, LibraryFragment.newInstance())
                        .addToBackStack(String.valueOf(R.id.fragment));
                break;
            case GROUP_D:
                fragmentTransaction.replace(R.id.fragment, LibraryFragment.newInstance())
                        .addToBackStack(String.valueOf(R.id.fragment));
                break;
            case GROUP_E:
                fragmentTransaction.replace(R.id.fragment, LibraryFragment.newInstance())
                        .addToBackStack(String.valueOf(R.id.fragment));
                break;
            case GROUP_F:
                fragmentTransaction.replace(R.id.fragment, LibraryFragment.newInstance())
                        .addToBackStack(String.valueOf(R.id.fragment));
                break;
            case GROUP_G:
                fragmentTransaction.replace(R.id.fragment, LibraryFragment.newInstance())
                        .addToBackStack(String.valueOf(R.id.fragment));
                break;
            case GROUP_H:
                fragmentTransaction.replace(R.id.fragment, LibraryFragment.newInstance())
                        .addToBackStack(String.valueOf(R.id.fragment));
                break;
            case SETTINGS:
                fragmentTransaction.replace(R.id.fragment, SettingsFragment.newInstance())
                        .addToBackStack(String.valueOf(R.id.fragment));
                break;

        }

        fragmentTransaction.commit();

    }




    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void onCardViewClick (View view)
    {
//        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        Bundle bundle = new Bundle();
        bundle.putString("title", "War & Peace");
        bundle.putString("authors", "Tolstoy L. N.");
        bundle.putString("number", "0001");
        bundle.putString("owner", "Tolstoy L. N.");
        bundle.putString("full_text", "Кутузов, сопутствуемый своими адъютантами, поехал шагом за карабинерами.\n" +
                "Проехав с полверсты в хвосте колонны, он остановился у одинокого заброшенного дома (вероятно, бывшего трактира) подле разветвления двух дорог. Обе дороги спускались под гору, и по обеим шли войска.\n" +
                "Туман начинал расходиться, и неопределенно, верстах в двух расстояния, виднелись уже неприятельские войска на противоположных возвышенностях. Налево внизу стрельба становилась слышнее. Кутузов остановился, разговаривая с австрийским генералом. Князь Андрей, стоя несколько позади, вглядывался в них и, желая попросить зрительную трубу у адъютанта, обратился к нему.\n" +
                "— Посмотрите, посмотрите, — говорил этот адъютант, глядя не на дальние войска, а вниз по горе перед собой. — Это французы!\n" +
                "Два генерала и адъютанты стали хвататься за трубу, вырывая ее один у другого. Все лица вдруг изменились, и на всех выразился ужас. Французов предполагали за две версты от нас, а они явились вдруг неожиданно перед нами.\n" +
                "— Это неприятель?.. Нет!.. Да, смотрите, он... наверное... Что ж это? — послышались голоса.\n" +
                "Князь Андрей простым глазом увидал внизу направо поднимавшуюся навстречу апшеронцам густую колонну французов, не дальше пятисот шагов от того места, где стоял Кутузов.\n" +
                "«Вот она, наступила решительная минута! Дошло до меня дело», — подумал князь Андрей и, ударив лошадь, подъехал к Кутузову.\n" +
                "— Надо остановить апшеронцев, — закричал он, — ваше высокопревосходительство!\n" +
                "Но в тот же миг все застлалось дымом, раздалась близкая стрельба, и наивно испуганный голос в двух шагах от князя Андрея закричал: «Ну, братцы, шабаш!» И как будто голос этот был команда. По этому голосу все бросились бежать.\n" +
                "Смешанные, все увеличивающиеся толпы бежали назад к тому месту, где пять минут тому назад войска проходили мимо императоров. Не только трудно было остановить эту толпу, но невозможно было самим не податься назад вместе с толпой. Болконский только старался не отставать от Кутузова и оглядывался, недоумевая и не в силах понять того, что делалось перед ним. Несвицкий, с озлобленным видом, красный и на себя не похожий, кричал Кутузову, что, ежели он не уедет сейчас, он будет взят в плен наверное. Кутузов стоял на том же месте и, не отвечая, доставал платок. Из щеки его текла кровь. Князь Андрей протеснился до него.\n" +
                "— Вы ранены? — спросил он, едва удерживая дрожание нижней челюсти.\n" +
                "— Рана не здесь, а вот где! — сказал Кутузов, прижимая платок к раненой щеке и указывая на бегущих.\n" +
                "— Остановите же их! — крикнул он и в то же время, вероятно, убедясь, что невозможно было их остановить, ударил лошадь и поехал вправо.\n" +
                "Вновь нахлынувшая толпа бегущих захватила его с собой и повлекла назад.\n" +
                "Войска бежали такою густою толпою, что, раз попавши в середину толпы, трудно было из нее выбраться. Кто кричал: «Пошел, что замешкался?» Кто тут же, оборачиваясь, стрелял в воздух; кто бил лошадь, на которой ехал сам Кутузов. С величайшим усилием выбравшись из потока толпы влево, Кутузов со свитой, уменьшенной более чем вдвое, поехал на звуки близких орудийных выстрелов. Выбравшись из толпы бегущих, князь Андрей, стараясь не отставать от Кутузова, увидал на спуске горы, в дыму, еще стрелявшую русскую батарею и подбегающих к ней французов. Повыше стояла русская пехота, не двигаясь ни вперед на помощь батарее, ни назад по одному направлению с бегущими. Генерал верхом отделился от этой пехоты и подъехал к Кутузову. Из свиты Кутузова осталось только четыре человека. Все были бледны и молча переглядывались.\n" +
                "— Остановите этих мерзавцев! — задыхаясь, проговорил Кутузов полковому командиру, указывая на бегущих; но в то же мгновение, как будто в наказание за эти слова, как рой птичек, со свистом пролетели пули по полку и свите Кутузова.\n" +
                "Французы атаковали батарею и, увидав Кутузова, выстрелили по нем. С этим залпом полковой командир схватился за ногу; упало несколько солдат, и подпрапорщик, стоявший с знаменем, выпустил его из рук; знамя зашаталось и упало, задержавшись на ружьях соседних солдат. Солдаты без команды стали стрелять.\n" +
                "— О-оох! — с выражением отчаяния промычал Кутузов и оглянулся. — Болконский, — прошептал он дрожащим от сознания своего старческого бессилия голосом. — Болконский, — прошептал он, указывая на расстроенный батальон и на неприятеля, — что ж это?\n" +
                "Но прежде чем он договорил это слово, князь Андрей, чувствуя слезы стыда и злобы, подступавшие ему к горлу, уже соскакивал с лошади и бежал к знамени.\n" +
                "— Ребята, вперед! — крикнул он детски пронзительно.\n" +
                "«Вот оно!» — думал князь Андрей, схватив древко знамени и с наслаждением слыша свист пуль, очевидно направленных именно против него. Несколько солдат упало.\n" +
                "— Ура! — закричал князь Андрей, едва удерживая в руках тяжелое знамя, и побежал вперед с несомненной уверенностью, что весь батальон побежит за ним.\n" +
                "И действительно, он пробежал один только несколько шагов. Тронулся один, другой солдат, и весь батальон с криком «ура!» побежал вперед и обогнал его. Унтер-офицер батальона, подбежав, взял колебавшееся от тяжести в руках князя Андрея знамя, но тотчас же был убит. Князь Андрей опять схватил знамя и, волоча его за древко, бежал с батальоном. Впереди себя он видел наших артиллеристов, из которых одни дрались, другие бросали пушки и бежали к нему навстречу; он видел и французских пехотных солдат, которые хватали артиллерийских лошадей и поворачивали пушки. Князь Андрей с батальоном уже был в двадцати шагах от орудий. Он слышал над собою неперестававший свист пуль, и беспрестанно справа и слева от него охали и падали солдаты. Но он не смотрел на них; он вглядывался только в то, что происходило впереди его — на батарее. Он ясно видел уже одну фигуру рыжего артиллериста с сбитым набок кивером, тянущего с одной стороны банник, тогда как французский солдат тянул банник к себе за другую сторону. Князь Андрей видел уже ясно растерянное и вместе озлобленное выражение лиц этих двух людей, видимо, не понимавших того, что они делали.\n" +
                "«Что они делают? — думал князь Андрей, глядя на них. — Зачем не бежит рыжий артиллерист, когда у него нет оружия? Зачем не колет его француз? Не успеет добежать, как француз вспомнит о ружье и заколет его».\n" +
                "Действительно, другой француз, с ружьем наперевес, подбежал к борющимся, и участь рыжего артиллериста, все еще не понимавшего того, что ожидает его, и с торжеством выдернувшего банник, должна была решиться. Но князь Андрей не видал, чем это кончилось. Как бы со всего размаха крепкою палкой кто-то из ближайших солдат, как ему показалось, ударил его в голову. Немного это больно было, а главное, неприятно, потому что боль эта развлекала его и мешала ему видеть то, на что он смотрел.\n" +
                "«Что это? я падаю! у меня ноги подкашиваются», — подумал он и упал на спину. Он раскрыл глаза, надеясь увидать, чем кончилась борьба французов с артиллеристами, и желая знать, убит или нет рыжий артиллерист, взяты или спасены пушки. Но он ничего не видал. Над ним не было ничего уже, кроме неба, — высокого неба, не ясного, но все-таки неизмеримо высокого, с тихо ползущими по нем серыми облаками. «Как тихо, спокойно и торжественно, совсем не так, как я бежал, — подумал князь Андрей, — не так, как мы бежали, кричали и дрались; совсем не так, как с озлобленными и испуганными лицами тащили друг у друга банник француз и артиллерист, — совсем не так ползут облака по этому высокому бесконечному небу. Как же я не видал прежде этого высокого неба? И как я счастлив, что узнал его наконец. Да! все пустое, все обман, кроме этого бесконечного неба. Ничего, ничего нет, кроме его. Но и того даже нет, ничего нет, кроме тишины, успокоения. И слава Богу!..»");
        PatentFragment patentFragment = new PatentFragment();
        patentFragment.setArguments(bundle);

        fragmentTransaction.replace(R.id.fragment, patentFragment)
                .addToBackStack(String.valueOf(R.id.fragment));
        fragmentTransaction.commit();

    }

}
