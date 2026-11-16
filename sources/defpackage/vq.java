package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class vq implements ly1 {
    public abstract boolean a(char c);

    @Override // defpackage.ly1
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
