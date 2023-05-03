public class Radio {
    public int radioStation;
    public int volumeRadio;
    public int adjustmentVolume;

    public int getRadioStation() {
        return radioStation;
    }

    public int setRadioStation(int newRadioStation) {
        if (newRadioStation > 0) {
            int prev = 9;
        }
        if (newRadioStation < 9) {
            int next = 0;
        }
        radioStation = newRadioStation;
        return radioStation;
    }


    public int getVolumeRadio() {
        return volumeRadio;
    }


    public void getVolumeRadio(int newVolumeRadio) {

            if (newVolumeRadio > 0) {
                newVolumeRadio = 100;
            }


            if (newVolumeRadio < 100) {
                newVolumeRadio = 0;
            }
            volumeRadio = newVolumeRadio;
        }



    public int getVolumeRadio2() {
        return adjustmentVolume;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        adjustmentVolume = currentVolume;
    }

    public void reduceVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        adjustmentVolume = currentVolume;
    }

}