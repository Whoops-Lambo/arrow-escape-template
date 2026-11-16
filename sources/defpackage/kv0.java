package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kv0 extends es2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ es2 b;

    public /* synthetic */ kv0(es2 es2Var, int i) {
        this.a = i;
        this.b = es2Var;
    }

    @Override // defpackage.es2
    public final Object a(JsonReader jsonReader) throws IOException {
        int i = this.a;
        es2 es2Var = this.b;
        switch (i) {
            case 0:
                return new AtomicLong(((Number) es2Var.a(jsonReader)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) es2Var.a(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            case 2:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return es2Var.a(jsonReader);
                }
                jsonReader.nextNull();
                return null;
            default:
                Date date = (Date) es2Var.a(jsonReader);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
        }
    }

    @Override // defpackage.es2
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException {
        int i = this.a;
        es2 es2Var = this.b;
        switch (i) {
            case 0:
                es2Var.b(jsonWriter, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    es2Var.b(jsonWriter, Long.valueOf(atomicLongArray.get(i2)));
                }
                jsonWriter.endArray();
                break;
            case 2:
                if (obj == null) {
                    jsonWriter.nullValue();
                } else {
                    es2Var.b(jsonWriter, obj);
                }
                break;
            default:
                es2Var.b(jsonWriter, (Timestamp) obj);
                break;
        }
    }
}
