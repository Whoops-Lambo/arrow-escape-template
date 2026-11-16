package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class o6 extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ File j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6(int i, File file) {
        super(0);
        this.i = i;
        this.j = file;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        File file = this.j;
        switch (i) {
            case 0:
                File file2 = new File(file, "usercentrics");
                file2.mkdirs();
                return file2;
            case 1:
                return "Remove from cache: " + file.getName();
            default:
                return "Track usage for " + file.getName();
        }
    }
}
