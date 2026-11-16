package com.adsurge.adn.lib.dysi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public interface IGDTSDK {
    void bindData(String str);

    void cancelAnimation(String str);

    void clickAdContinued(String str);

    void cod(String str);

    void feedbackSubmitData(String str);

    int findViewByTag(String str);

    String gdm();

    @Deprecated
    int getSettingInt(String str);

    int getSettingIntWithDef(String str, int i);

    @Deprecated
    String getSettingString(String str);

    String getSettingStringWithDef(String str, String str2);

    int grt();

    int gso();

    String gti(String str);

    void interactionContinued(String str);

    void log(String str);

    void observeDLEngine(String str);

    void pauseTimer();

    void playAnimatableImage(String str);

    void rco(String str);

    void resumeTimer();

    void setEventTimeout(String str, int i);

    void setReducedTime(int i);

    @Deprecated
    void setTimeout(String str, int i);

    void showAnimation(String str);

    void showAnimationFraction(String str, double d);

    void tar(String str);

    void track(String str);

    void ue(String str);

    void vibrateMobilePhone(String str);
}
