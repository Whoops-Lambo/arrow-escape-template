package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mp4 extends kp4 {
    public static final int b = Integer.numberOfLeadingZeros(31);
    public static final mp4 c = new mp4("CharMatcher.whitespace()");

    @Override // com.google.android.gms.internal.ads.zzgvn
    public final boolean a(char c2) {
        if ("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c2) >>> b) == c2) {
            return true;
        }
        return false;
    }
}
