package com.adsurge.adn.lib.callback;

import com.adsurge.adn.p018e1.b;
import com.adsurge.adn.p018e1.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface DialogStateCallback extends b {
    public static final int DIALOG_TYPE_DOWNLOAD = 3;
    public static final int DIALOG_TYPE_NEGATIVE_FEEDBACK = 1;
    public static final int DIALOG_TYPE_OPEN_APP_CONFIRM = 4;
    public static final int DIALOG_TYPE_RETENTION = 2;

    c onDismiss();

    c onShow();
}
