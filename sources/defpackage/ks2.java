package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ks2 extends es2 {
    public final /* synthetic */ int a;

    public /* synthetic */ ks2(int i) {
        this.a = i;
    }

    @Override // defpackage.es2
    public final Object a(JsonReader jsonReader) {
        switch (this.a) {
            case 0:
                return new AtomicBoolean(jsonReader.nextBoolean());
            default:
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new kb1(e);
                }
        }
    }

    @Override // defpackage.es2
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                jsonWriter.value(((AtomicBoolean) obj).get());
                break;
            default:
                jsonWriter.value(((AtomicInteger) obj).get());
                break;
        }
    }
}
