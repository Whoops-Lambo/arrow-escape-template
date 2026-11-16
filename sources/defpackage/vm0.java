package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vm0 extends um0 {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ ym0 f;

    @Override // defpackage.zm0
    public final File a() {
        boolean z = this.e;
        File file = this.a;
        if (!z && this.c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null) {
                zr0 zr0Var = (zr0) this.f.d.d;
                if (zr0Var != null) {
                    File file2 = this.a;
                    zr0Var.invoke(file2, new w2(file2, null, "Cannot list files in a directory", 2, null));
                }
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr == null || this.d >= fileArr.length) {
            if (this.b) {
                return null;
            }
            this.b = true;
            return file;
        }
        fileArr.getClass();
        int i = this.d;
        this.d = i + 1;
        return fileArr[i];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm0(ym0 ym0Var, File file) {
        super(file);
        file.getClass();
        this.f = ym0Var;
    }
}
