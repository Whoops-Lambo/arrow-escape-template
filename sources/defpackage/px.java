package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class px {
    public static final rx a;

    static {
        gg0 gg0Var = gg0.a;
        new rx("multipart", "*", gg0Var);
        new rx("multipart", "mixed", gg0Var);
        new rx("multipart", "alternative", gg0Var);
        new rx("multipart", "related", gg0Var);
        a = new rx("multipart", "form-data", gg0Var);
        new rx("multipart", "signed", gg0Var);
        new rx("multipart", "encrypted", gg0Var);
        new rx("multipart", "byteranges", gg0Var);
    }
}
