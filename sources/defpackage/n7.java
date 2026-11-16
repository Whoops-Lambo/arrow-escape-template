package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class n7 {
    public final int a;
    public final int b;

    public n7(int i, int i2) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7)) {
            return false;
        }
        n7 n7Var = (n7) obj;
        return this.a == n7Var.a && this.b == n7Var.b;
    }

    public final int hashCode() {
        int iC = h50.C(this.a) * 31;
        int i = this.b;
        return iC + (i == 0 ? 0 : h50.C(i));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SectionFieldMapping(section=");
        sb.append(nj.D(this.a));
        sb.append(", field=");
        switch (this.b) {
            case 1:
                str = "ANON_ID";
                break;
            case 2:
                str = "FB_LOGIN_ID";
                break;
            case 3:
                str = "MAD_ID";
                break;
            case 4:
                str = "PAGE_ID";
                break;
            case 5:
                str = "PAGE_SCOPED_USER_ID";
                break;
            case 6:
                str = "USER_DATA";
                break;
            case 7:
                str = "ADV_TE";
                break;
            case 8:
                str = "APP_TE";
                break;
            case 9:
                str = "CONSIDER_VIEWS";
                break;
            case 10:
                str = "DEVICE_TOKEN";
                break;
            case 11:
                str = "EXT_INFO";
                break;
            case 12:
                str = "INCLUDE_DWELL_DATA";
                break;
            case 13:
                str = "INCLUDE_VIDEO_DATA";
                break;
            case 14:
                str = "INSTALL_REFERRER";
                break;
            case 15:
                str = "INSTALLER_PACKAGE";
                break;
            case 16:
                str = "RECEIPT_DATA";
                break;
            case 17:
                str = "URL_SCHEMES";
                break;
            case 18:
                str = "ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
