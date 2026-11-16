package androidx.datastore.preferences.core;

import defpackage.cn0;
import defpackage.d;
import defpackage.rc1;
import defpackage.sr0;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class PreferenceDataStoreFactory$create$delegate$1 extends rc1 implements sr0 {
    public final /* synthetic */ sr0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreFactory$create$delegate$1(sr0 sr0Var) {
        super(0);
        this.i = sr0Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        File file = (File) this.i.invoke();
        if (!cn0.A(file).equals("preferences_pb")) {
            d.i(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
            return null;
        }
        File absoluteFile = file.getAbsoluteFile();
        absoluteFile.getClass();
        return absoluteFile;
    }
}
