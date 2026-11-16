package io.p071bidmachine.iab.mraid;

import defpackage.er;
import defpackage.nj;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class j extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, int i) {
        super(0);
        this.i = i;
        this.j = str;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        String str = this.j;
        switch (i) {
            case 0:
                return "Callback - onCalendarEvent: " + str;
            case 1:
                return "Callback - onExpand: " + str;
            case 2:
                return "Callback - onOpen: ".concat(str);
            case 3:
                return "Callback - onOpenPrivacySheet: ".concat(str);
            case 4:
                return "Callback - onPlayVideo: " + str;
            case 5:
                return "Callback - onStorePicture: " + str;
            case 6:
                return str;
            case 7:
                return str.concat(" is unknown");
            case 8:
                return nj.q(new StringBuilder("URL "), str, " is missing parameters");
            case 9:
                return String.valueOf(str);
            case 10:
                return String.valueOf(str);
            case 11:
                return String.valueOf(str);
            case 12:
                return "handleJsCommand - ".concat(str);
            case 13:
                return "unregistered message listener: " + str;
            case 14:
                return "evaluating js (" + str.length() + " chars)";
            case 15:
                byte[] bytes = str.getBytes(er.a);
                bytes.getClass();
                return bytes;
            case 16:
                return "target - ".concat(str);
            case 17:
                return "target - ".concat(str);
            case 18:
                return "Can't parse change layout value to ElementLayoutParams - ".concat(str);
            case 19:
                return "target - ".concat(str);
            case 20:
                return "target - ".concat(str);
            case 21:
            case 22:
            case 23:
                return str;
            case 24:
                return "target - ".concat(str);
            case 25:
                return "target - ".concat(str);
            case 26:
                return "target - ".concat(str);
            case 27:
                return str;
            case 28:
                return "target - ".concat(str);
            default:
                return "target - ".concat(str);
        }
    }
}
