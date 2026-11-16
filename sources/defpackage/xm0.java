package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xm0 extends um0 {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ ym0 e;

    @Override // defpackage.zm0
    public final File a() {
        zr0 zr0Var;
        boolean z = this.b;
        File file = this.a;
        if (!z) {
            this.b = true;
            return file;
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null && (zr0Var = (zr0) this.e.d.d) != null) {
                File file2 = this.a;
                zr0Var.invoke(file2, new w2(file2, null, "Cannot list files in a directory", 2, null));
            }
            File[] fileArr2 = this.c;
            if (fileArr2 == null || fileArr2.length == 0) {
                return null;
            }
        }
        File[] fileArr3 = this.c;
        fileArr3.getClass();
        int i = this.d;
        this.d = i + 1;
        return fileArr3[i];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm0(ym0 ym0Var, File file) {
        super(file);
        file.getClass();
        this.e = ym0Var;
    }
}
