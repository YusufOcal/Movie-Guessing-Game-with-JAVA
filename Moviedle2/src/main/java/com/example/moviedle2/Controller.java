package com.example.moviedle2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Controller {
    @FXML
    protected Label title;

    @FXML
    protected TextField txtGuess;

    @FXML
    protected Button btnGuess;

    @FXML
    protected  Label nameBox1;
    @FXML
    protected Label nameBox2;
    @FXML
    protected Label nameBox3;
    @FXML
    protected Label nameBox4;
    @FXML
    protected Label nameBox5;

    @FXML
    protected Label yearBox1;
    @FXML
    protected Label yearBox2;
    @FXML
    protected Label yearBox3;
    @FXML
    protected Label yearBox4;
    @FXML
    protected Label yearBox5;

    @FXML
    protected Label typeBox1;
    @FXML
    protected Label typeBox2;
    @FXML
    protected Label typeBox3;
    @FXML
    protected Label typeBox4;
    @FXML
    protected Label typeBox5;

    @FXML
    protected Label countryBox1;
    @FXML
    protected Label countryBox2;
    @FXML
    protected Label countryBox3;
    @FXML
    protected Label countryBox4;
    @FXML
    protected Label countryBox5;

    @FXML
    protected Label directorBox1;
    @FXML
    protected Label directorBox2;
    @FXML
    protected Label directorBox3;
    @FXML
    protected Label directorBox4;
    @FXML
    protected Label directorBox5;

    @FXML
    protected Label starBox1;
    @FXML
    protected Label starBox2;
    @FXML
    protected Label starBox3;
    @FXML
    protected Label starBox4;
    @FXML
    protected Label starBox5;

    @FXML
    protected Rectangle rectName1;
    @FXML
    protected Rectangle rectName2;
    @FXML
    protected Rectangle rectName3;
    @FXML
    protected Rectangle rectName4;
    @FXML
    protected Rectangle rectName5;
    @FXML
    protected Rectangle rectYear1;
    @FXML
    protected Rectangle rectYear2;
    @FXML
    protected Rectangle rectYear3;
    @FXML
    protected Rectangle rectYear4;
    @FXML
    protected Rectangle rectYear5;
    @FXML
    protected Rectangle rectType1;
    @FXML
    protected Rectangle rectType2;
    @FXML
    protected Rectangle rectType3;
    @FXML
    protected Rectangle rectType4;
    @FXML
    protected Rectangle rectType5;
    @FXML
    protected Rectangle rectCountry1;
    @FXML
    protected Rectangle rectCountry2;
    @FXML
    protected Rectangle rectCountry3;
    @FXML
    protected Rectangle rectCountry4;
    @FXML
    protected Rectangle rectCountry5;
    @FXML
    protected Rectangle rectDirector1;
    @FXML
    protected Rectangle rectDirector2;
    @FXML
    protected Rectangle rectDirector3;
    @FXML
    protected Rectangle rectDirector4;
    @FXML
    protected Rectangle rectDirector5;
    @FXML
    protected Rectangle rectStar1;
    @FXML
    protected Rectangle rectStar2;
    @FXML
    protected Rectangle rectStar3;
    @FXML
    protected Rectangle rectStar4;
    @FXML
    protected Rectangle rectStar5;

    private final String[] randomMovieValues;
    private int clickCount = 0;

    private boolean lost = false;

    public Controller() {
        randomMovieValues = Movie.getRandomMovie(Movie.filePath);
        initializeOnce();
    }
    private void initializeOnce() {

    }

    @FXML
    protected void onMouseClicked() {
        clickCount++;

        String guessedMovieName = txtGuess.getText();
        String[] guessedMovieValues = Movie.findMovie(Movie.filePath, guessedMovieName);

        // TEST KOD: KAZANILDIĞINDA ÇALIŞIP ÇALIŞMADIĞINI GÖRMEK İÇİN YAZAILMIŞTIR.
        starBox5.setText(randomMovieValues[1]);

        if (clickCount == 1) {
            if ((guessedMovieValues[1]).equalsIgnoreCase(randomMovieValues[1])) {
                nameBox1.requestFocus();
                nameBox1.setText(guessedMovieValues[1]);
                rectName1.setFill(Color.GREEN);
            } else {
                nameBox1.requestFocus();
                nameBox1.setText(guessedMovieValues[1]);
                rectName1.setFill(Color.RED);
            }
            if ((guessedMovieValues[2]).equalsIgnoreCase(randomMovieValues[2])) {
                yearBox1.requestFocus();
                yearBox1.setText(guessedMovieValues[2]);
                rectYear1.setFill(Color.GREEN);
            } else {
                yearBox1.requestFocus();
                yearBox1.setText(guessedMovieValues[2]);
                rectYear1.setFill(Color.RED);
            }
            if ((guessedMovieValues[3]).equalsIgnoreCase(randomMovieValues[3])) {
                typeBox1.requestFocus();
                typeBox1.setText(guessedMovieValues[3]);
                rectType1.setFill(Color.GREEN);
            } else {
                typeBox1.requestFocus();
                typeBox1.setText(guessedMovieValues[3]);
                rectType1.setFill(Color.RED);
            }
            if ((guessedMovieValues[4]).equalsIgnoreCase(randomMovieValues[4])) {
                countryBox1.requestFocus();
                countryBox1.setText(guessedMovieValues[4]);
                rectCountry1.setFill(Color.GREEN);
            } else {
                countryBox1.requestFocus();
                countryBox1.setText(guessedMovieValues[4]);
                rectCountry1.setFill(Color.RED);
            }
            if ((guessedMovieValues[5]).equalsIgnoreCase(randomMovieValues[5])) {
                directorBox1.requestFocus();
                directorBox1.setText(guessedMovieValues[5]);
                rectDirector1.setFill(Color.GREEN);
            } else {
                directorBox1.requestFocus();
                directorBox1.setText(guessedMovieValues[5]);
                rectDirector1.setFill(Color.RED);
            }
            if ((guessedMovieValues[6]).equalsIgnoreCase(randomMovieValues[6])) {
                starBox1.requestFocus();
                starBox1.setText(guessedMovieValues[6]);
                rectStar1.setFill(Color.GREEN);
            } else {
                starBox1.requestFocus();
                starBox1.setText(guessedMovieValues[5]);
                rectStar1.setFill(Color.RED);
            }
            isWon(guessedMovieValues);
        }

        if (clickCount == 2) {
            if ((guessedMovieValues[1]).equalsIgnoreCase(randomMovieValues[1])) {
                nameBox2.requestFocus();
                nameBox2.setText(guessedMovieValues[1]);
                rectName2.setFill(Color.GREEN);
            } else {
                nameBox2.requestFocus();
                nameBox2.setText(guessedMovieValues[1]);
                rectName2.setFill(Color.RED);
            }
            if ((guessedMovieValues[2]).equalsIgnoreCase(randomMovieValues[2])) {
                yearBox2.requestFocus();
                yearBox2.setText(guessedMovieValues[2]);
                rectYear2.setFill(Color.GREEN);
            } else {
                yearBox2.requestFocus();
                yearBox2.setText(guessedMovieValues[2]);
                rectYear2.setFill(Color.RED);
            }
            if ((guessedMovieValues[3]).equalsIgnoreCase(randomMovieValues[3])) {
                typeBox2.requestFocus();
                typeBox2.setText(guessedMovieValues[3]);
                rectType2.setFill(Color.GREEN);
            } else {
                typeBox2.requestFocus();
                typeBox2.setText(guessedMovieValues[3]);
                rectType2.setFill(Color.RED);
            }
            if ((guessedMovieValues[4]).equalsIgnoreCase(randomMovieValues[4])) {
                countryBox2.requestFocus();
                countryBox2.setText(guessedMovieValues[4]);
                rectCountry2.setFill(Color.GREEN);
            } else {
                countryBox2.requestFocus();
                countryBox2.setText(guessedMovieValues[4]);
                rectCountry2.setFill(Color.RED);
            }
            if ((guessedMovieValues[5]).equalsIgnoreCase(randomMovieValues[5])) {
                directorBox2.requestFocus();
                directorBox2.setText(guessedMovieValues[5]);
                rectDirector2.setFill(Color.GREEN);
            } else {
                directorBox2.requestFocus();
                directorBox2.setText(guessedMovieValues[5]);
                rectDirector2.setFill(Color.RED);
            }
            if ((guessedMovieValues[6]).equalsIgnoreCase(randomMovieValues[6])) {
                starBox2.requestFocus();
                starBox2.setText(guessedMovieValues[6]);
                rectStar2.setFill(Color.GREEN);
            } else {
                starBox2.requestFocus();
                starBox2.setText(guessedMovieValues[5]);
                rectStar2.setFill(Color.RED);
            }
            isWon(guessedMovieValues);
        }

        if (clickCount == 3) {
            if ((guessedMovieValues[1]).equalsIgnoreCase(randomMovieValues[1])) {
                nameBox3.requestFocus();
                nameBox3.setText(guessedMovieValues[1]);
                rectName3.setFill(Color.GREEN);
            } else {
                nameBox3.requestFocus();
                nameBox3.setText(guessedMovieValues[1]);
                rectName3.setFill(Color.RED);
            }
            if ((guessedMovieValues[2]).equalsIgnoreCase(randomMovieValues[2])) {
                yearBox3.requestFocus();
                yearBox3.setText(guessedMovieValues[2]);
                rectYear3.setFill(Color.GREEN);
            } else {
                yearBox3.requestFocus();
                yearBox3.setText(guessedMovieValues[2]);
                rectYear3.setFill(Color.RED);
            }
            if ((guessedMovieValues[3]).equalsIgnoreCase(randomMovieValues[3])) {
                typeBox3.requestFocus();
                typeBox3.setText(guessedMovieValues[3]);
                rectType3.setFill(Color.GREEN);
            } else {
                typeBox3.requestFocus();
                typeBox3.setText(guessedMovieValues[3]);
                rectType3.setFill(Color.RED);
            }
            if ((guessedMovieValues[4]).equalsIgnoreCase(randomMovieValues[4])) {
                countryBox3.requestFocus();
                countryBox3.setText(guessedMovieValues[4]);
                rectCountry3.setFill(Color.GREEN);
            } else {
                countryBox3.requestFocus();
                countryBox3.setText(guessedMovieValues[4]);
                rectCountry3.setFill(Color.RED);
            }
            if ((guessedMovieValues[5]).equalsIgnoreCase(randomMovieValues[5])) {
                directorBox3.requestFocus();
                directorBox3.setText(guessedMovieValues[5]);
                rectDirector3.setFill(Color.GREEN);
            } else {
                directorBox3.requestFocus();
                directorBox3.setText(guessedMovieValues[5]);
                rectDirector3.setFill(Color.RED);
            }
            if ((guessedMovieValues[6]).equalsIgnoreCase(randomMovieValues[6])) {
                starBox3.requestFocus();
                starBox3.setText(guessedMovieValues[6]);
                rectStar3.setFill(Color.GREEN);
            } else {
                starBox3.requestFocus();
                starBox3.setText(guessedMovieValues[5]);
                rectStar3.setFill(Color.RED);
            }
            isWon(guessedMovieValues);
        }

        if (clickCount == 4) {
            if ((guessedMovieValues[1]).equalsIgnoreCase(randomMovieValues[1])) {
                nameBox4.requestFocus();
                nameBox4.setText(guessedMovieValues[1]);
                rectName4.setFill(Color.GREEN);
            } else {
                nameBox4.requestFocus();
                nameBox4.setText(guessedMovieValues[1]);
                rectName4.setFill(Color.RED);
            }
            if ((guessedMovieValues[2]).equalsIgnoreCase(randomMovieValues[2])) {
                yearBox4.requestFocus();
                yearBox4.setText(guessedMovieValues[2]);
                rectYear4.setFill(Color.GREEN);
            } else {
                yearBox4.requestFocus();
                yearBox4.setText(guessedMovieValues[2]);
                rectYear4.setFill(Color.RED);
            }
            if ((guessedMovieValues[3]).equalsIgnoreCase(randomMovieValues[3])) {
                typeBox4.requestFocus();
                typeBox4.setText(guessedMovieValues[3]);
                rectType4.setFill(Color.GREEN);
            } else {
                typeBox4.requestFocus();
                typeBox4.setText(guessedMovieValues[3]);
                rectType4.setFill(Color.RED);
            }
            if ((guessedMovieValues[4]).equalsIgnoreCase(randomMovieValues[4])) {
                countryBox4.requestFocus();
                countryBox4.setText(guessedMovieValues[4]);
                rectCountry4.setFill(Color.GREEN);
            } else {
                countryBox4.requestFocus();
                countryBox4.setText(guessedMovieValues[4]);
                rectCountry4.setFill(Color.RED);
            }
            if ((guessedMovieValues[5]).equalsIgnoreCase(randomMovieValues[5])) {
                directorBox4.requestFocus();
                directorBox4.setText(guessedMovieValues[5]);
                rectDirector4.setFill(Color.GREEN);
            } else {
                directorBox4.requestFocus();
                directorBox4.setText(guessedMovieValues[5]);
                rectDirector4.setFill(Color.RED);
            }
            if ((guessedMovieValues[6]).equalsIgnoreCase(randomMovieValues[6])) {
                starBox4.requestFocus();
                starBox4.setText(guessedMovieValues[6]);
                rectStar4.setFill(Color.GREEN);
            } else {
                starBox4.requestFocus();
                starBox4.setText(guessedMovieValues[5]);
                rectStar4.setFill(Color.RED);
            }
            isWon(guessedMovieValues);
        }

        if (clickCount == 5) {
            if ((guessedMovieValues[1]).equalsIgnoreCase(randomMovieValues[1])) {
                nameBox5.requestFocus();
                nameBox5.setText(guessedMovieValues[1]);
                rectName5.setFill(Color.GREEN);
            } else {
                nameBox5.requestFocus();
                nameBox5.setText(guessedMovieValues[1]);
                rectName5.setFill(Color.RED);
            }
            if ((guessedMovieValues[2]).equalsIgnoreCase(randomMovieValues[2])) {
                yearBox5.requestFocus();
                yearBox5.setText(guessedMovieValues[2]);
                rectYear5.setFill(Color.GREEN);
            } else {
                yearBox5.requestFocus();
                yearBox5.setText(guessedMovieValues[2]);
                rectYear5.setFill(Color.RED);
            }
            if ((guessedMovieValues[3]).equalsIgnoreCase(randomMovieValues[3])) {
                typeBox5.requestFocus();
                typeBox5.setText(guessedMovieValues[3]);
                rectType5.setFill(Color.GREEN);
            } else {
                typeBox5.requestFocus();
                typeBox5.setText(guessedMovieValues[3]);
                rectType5.setFill(Color.RED);
            }
            if ((guessedMovieValues[4]).equalsIgnoreCase(randomMovieValues[4])) {
                countryBox5.requestFocus();
                countryBox5.setText(guessedMovieValues[4]);
                rectCountry5.setFill(Color.GREEN);
            } else {
                countryBox5.requestFocus();
                countryBox5.setText(guessedMovieValues[4]);
                rectCountry5.setFill(Color.RED);
            }
            if ((guessedMovieValues[5]).equalsIgnoreCase(randomMovieValues[5])) {
                directorBox5.requestFocus();
                directorBox5.setText(guessedMovieValues[5]);
                rectDirector5.setFill(Color.GREEN);
            } else {
                directorBox5.requestFocus();
                directorBox5.setText(guessedMovieValues[5]);
                rectDirector5.setFill(Color.RED);
            }
            if ((guessedMovieValues[6]).equalsIgnoreCase(randomMovieValues[6])) {
                starBox5.requestFocus();
                starBox5.setText(guessedMovieValues[6]);
                rectStar5.setFill(Color.GREEN);
            } else {
                starBox5.requestFocus();
                starBox5.setText(guessedMovieValues[5]);
                rectStar5.setFill(Color.RED);
            }

            isWon(guessedMovieValues);

            if (lost==false){

                MainApp.losePopUp(new Stage());
            }
        }

        if (clickCount>=6){

            MainApp.losePopUp(new Stage());
        }

    }
    protected void isWon(String[] userValue){

        if ( (userValue[1]).equalsIgnoreCase(randomMovieValues[1]) && (userValue[2]).equalsIgnoreCase(randomMovieValues[2]) && (userValue[3]).equalsIgnoreCase(randomMovieValues[3]) &&  (userValue[4]).equalsIgnoreCase(randomMovieValues[4]) && (userValue[5]).equalsIgnoreCase(randomMovieValues[5]) && (userValue[6]).equalsIgnoreCase(randomMovieValues[6]) ) {

            MainApp.winPopUp(new Stage());
            lost = true;
        }
    }

}

