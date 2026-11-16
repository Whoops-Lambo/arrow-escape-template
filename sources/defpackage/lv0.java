package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lv0 extends es2 {
    public es2 a;

    @Override // defpackage.es2
    public final Object a(JsonReader jsonReader) {
        es2 es2Var = this.a;
        if (es2Var != null) {
            return es2Var.a(jsonReader);
        }
        y.b();
        return null;
    }

    @Override // defpackage.es2
    public final void b(JsonWriter jsonWriter, Object obj) {
        es2 es2Var = this.a;
        if (es2Var != null) {
            es2Var.b(jsonWriter, obj);
        } else {
            y.b();
        }
    }
}
