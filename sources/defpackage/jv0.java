package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jv0 extends es2 {
    public final /* synthetic */ int a;

    public /* synthetic */ jv0(int i) {
        this.a = i;
    }

    public static ha1 c(JsonReader jsonReader) throws IOException {
        switch (js2.a[jsonReader.peek().ordinal()]) {
            case 1:
                return new fb1(new fd1(jsonReader.nextString()));
            case 2:
                return new fb1(Boolean.valueOf(jsonReader.nextBoolean()));
            case 3:
                return new fb1(jsonReader.nextString());
            case 4:
                jsonReader.nextNull();
                return wa1.a;
            case 5:
                u91 u91Var = new u91();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    u91Var.a.add(c(jsonReader));
                }
                jsonReader.endArray();
                return u91Var;
            case 6:
                ya1 ya1Var = new ya1();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    ya1Var.a.put(jsonReader.nextName(), c(jsonReader));
                }
                jsonReader.endObject();
                return ya1Var;
            default:
                e32.a();
                return null;
        }
    }

    public static void d(ha1 ha1Var, JsonWriter jsonWriter) {
        if (ha1Var == null || (ha1Var instanceof wa1)) {
            jsonWriter.nullValue();
            return;
        }
        if (ha1Var instanceof fb1) {
            fb1 fb1Var = (fb1) ha1Var;
            Serializable serializable = fb1Var.a;
            if (serializable instanceof Number) {
                jsonWriter.value(fb1Var.d());
                return;
            } else if (serializable instanceof Boolean) {
                jsonWriter.value(fb1Var.c());
                return;
            } else {
                jsonWriter.value(fb1Var.e());
                return;
            }
        }
        boolean z = ha1Var instanceof u91;
        if (z) {
            jsonWriter.beginArray();
            if (!z) {
                vq2.v(ha1Var, "Not a JSON Array: ");
                return;
            }
            ArrayList arrayList = ((u91) ha1Var).a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                d((ha1) obj, jsonWriter);
            }
            jsonWriter.endArray();
            return;
        }
        boolean z2 = ha1Var instanceof ya1;
        if (!z2) {
            d.q(ha1Var.getClass(), "Couldn't write ");
            return;
        }
        jsonWriter.beginObject();
        if (!z2) {
            vq2.v(ha1Var, "Not a JSON Object: ");
            return;
        }
        Iterator it = ((ke1) ((ya1) ha1Var).a.entrySet()).iterator();
        while (((le1) it).hasNext()) {
            me1 me1VarA = ((je1) it).a();
            jsonWriter.name((String) me1VarA.getKey());
            d((ha1) me1VarA.getValue(), jsonWriter);
        }
        jsonWriter.endObject();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    @Override // defpackage.es2
    public final Object a(JsonReader jsonReader) throws IOException {
        boolean zNextBoolean;
        switch (this.a) {
            case 0:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            case 1:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            case 2:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Long.valueOf(jsonReader.nextLong());
                }
                jsonReader.nextNull();
                return null;
            case 3:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e) {
                        throw new kb1(e);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            case 4:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e2) {
                    throw new kb1(e2);
                }
            case 5:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            case 6:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            case 7:
                JsonToken jsonTokenPeek = jsonReader.peek();
                int i2 = js2.a[jsonTokenPeek.ordinal()];
                if (i2 == 1 || i2 == 3) {
                    return new fd1(jsonReader.nextString());
                }
                if (i2 == 4) {
                    jsonReader.nextNull();
                    return null;
                }
                vq2.i(jsonTokenPeek, "Expecting number, got: ");
                return null;
            case 8:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                if (strNextString.length() == 1) {
                    return Character.valueOf(strNextString.charAt(0));
                }
                throw new kb1("Expecting character, got: ".concat(strNextString));
            case 9:
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                if (jsonTokenPeek2 != JsonToken.NULL) {
                    return jsonTokenPeek2 == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
                jsonReader.nextNull();
                return null;
            case 10:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return new BigDecimal(jsonReader.nextString());
                } catch (NumberFormatException e3) {
                    throw new kb1(e3);
                }
            case 11:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return new BigInteger(jsonReader.nextString());
                } catch (NumberFormatException e4) {
                    throw new kb1(e4);
                }
            case 12:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case 13:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 14:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case 15:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString2 = jsonReader.nextString();
                if ("null".equals(strNextString2)) {
                    return null;
                }
                return new URL(strNextString2);
            case 16:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String strNextString3 = jsonReader.nextString();
                    if ("null".equals(strNextString3)) {
                        return null;
                    }
                    return new URI(strNextString3);
                } catch (URISyntaxException e5) {
                    throw new qa1(e5);
                }
            case 17:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case 18:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return UUID.fromString(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case 19:
                return Currency.getInstance(jsonReader.nextString());
            case 20:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String strNextName = jsonReader.nextName();
                    int iNextInt = jsonReader.nextInt();
                    if ("year".equals(strNextName)) {
                        i3 = iNextInt;
                    } else if ("month".equals(strNextName)) {
                        i4 = iNextInt;
                    } else if ("dayOfMonth".equals(strNextName)) {
                        i5 = iNextInt;
                    } else if ("hourOfDay".equals(strNextName)) {
                        i6 = iNextInt;
                    } else if ("minute".equals(strNextName)) {
                        i7 = iNextInt;
                    } else if ("second".equals(strNextName)) {
                        i8 = iNextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i3, i4, i5, i6, i7, i8);
            case 21:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 22:
                return c(jsonReader);
            case 23:
                BitSet bitSet = new BitSet();
                jsonReader.beginArray();
                JsonToken jsonTokenPeek3 = jsonReader.peek();
                int i9 = 0;
                while (jsonTokenPeek3 != JsonToken.END_ARRAY) {
                    int i10 = js2.a[jsonTokenPeek3.ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            zNextBoolean = jsonReader.nextBoolean();
                        } else {
                            if (i10 != 3) {
                                vq2.i(jsonTokenPeek3, "Invalid bitset value type: ");
                                return null;
                            }
                            String strNextString4 = jsonReader.nextString();
                            try {
                                if (Integer.parseInt(strNextString4) != 0) {
                                    zNextBoolean = true;
                                } else {
                                    zNextBoolean = false;
                                }
                            } catch (NumberFormatException unused) {
                                throw new kb1(n30.y("Error: Expecting: bitset number value (1, 0), Found: ", strNextString4));
                            }
                        }
                    } else if (jsonReader.nextInt() != 0) {
                        zNextBoolean = true;
                    } else {
                        zNextBoolean = false;
                    }
                    if (zNextBoolean) {
                        bitSet.set(i9);
                    }
                    i9++;
                    jsonTokenPeek3 = jsonReader.peek();
                }
                jsonReader.endArray();
                return bitSet;
            case 24:
                JsonToken jsonTokenPeek4 = jsonReader.peek();
                if (jsonTokenPeek4 != JsonToken.NULL) {
                    return jsonTokenPeek4 == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
                }
                jsonReader.nextNull();
                return null;
            case 25:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Boolean.valueOf(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case 26:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) jsonReader.nextInt());
                } catch (NumberFormatException e6) {
                    throw new kb1(e6);
                }
            case 27:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Short.valueOf((short) jsonReader.nextInt());
                } catch (NumberFormatException e7) {
                    throw new kb1(e7);
                }
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e8) {
                    throw new kb1(e8);
                }
        }
    }

    @Override // defpackage.es2
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException {
        int i = 0;
        switch (this.a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    Gson.checkValidFloatingPoint(number.doubleValue());
                    jsonWriter.value(number);
                    return;
                }
            case 1:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    Gson.checkValidFloatingPoint(number2.floatValue());
                    jsonWriter.value(number2);
                    return;
                }
            case 2:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    jsonWriter.value(number3.toString());
                    return;
                }
            case 3:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                while (i < length) {
                    jsonWriter.value(atomicIntegerArray.get(i));
                    i++;
                }
                jsonWriter.endArray();
                return;
            case 4:
                jsonWriter.value((Number) obj);
                return;
            case 5:
                jsonWriter.value((Number) obj);
                return;
            case 6:
                jsonWriter.value((Number) obj);
                return;
            case 7:
                jsonWriter.value((Number) obj);
                return;
            case 8:
                Character ch = (Character) obj;
                jsonWriter.value(ch != null ? String.valueOf(ch) : null);
                return;
            case 9:
                jsonWriter.value((String) obj);
                return;
            case 10:
                jsonWriter.value((BigDecimal) obj);
                return;
            case 11:
                jsonWriter.value((BigInteger) obj);
                return;
            case 12:
                StringBuilder sb = (StringBuilder) obj;
                jsonWriter.value(sb != null ? sb.toString() : null);
                return;
            case 13:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 14:
                StringBuffer stringBuffer = (StringBuffer) obj;
                jsonWriter.value(stringBuffer != null ? stringBuffer.toString() : null);
                return;
            case 15:
                URL url = (URL) obj;
                jsonWriter.value(url != null ? url.toExternalForm() : null);
                return;
            case 16:
                URI uri = (URI) obj;
                jsonWriter.value(uri != null ? uri.toASCIIString() : null);
                return;
            case 17:
                InetAddress inetAddress = (InetAddress) obj;
                jsonWriter.value(inetAddress != null ? inetAddress.getHostAddress() : null);
                return;
            case 18:
                UUID uuid = (UUID) obj;
                jsonWriter.value(uuid != null ? uuid.toString() : null);
                return;
            case 19:
                jsonWriter.value(((Currency) obj).getCurrencyCode());
                return;
            case 20:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value(calendar.get(1));
                jsonWriter.name("month");
                jsonWriter.value(calendar.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value(calendar.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value(calendar.get(11));
                jsonWriter.name("minute");
                jsonWriter.value(calendar.get(12));
                jsonWriter.name("second");
                jsonWriter.value(calendar.get(13));
                jsonWriter.endObject();
                return;
            case 21:
                Locale locale = (Locale) obj;
                jsonWriter.value(locale != null ? locale.toString() : null);
                return;
            case 22:
                d((ha1) obj, jsonWriter);
                return;
            case 23:
                BitSet bitSet = (BitSet) obj;
                jsonWriter.beginArray();
                int length2 = bitSet.length();
                while (i < length2) {
                    jsonWriter.value(bitSet.get(i) ? 1L : 0L);
                    i++;
                }
                jsonWriter.endArray();
                return;
            case 24:
                jsonWriter.value((Boolean) obj);
                return;
            case 25:
                Boolean bool = (Boolean) obj;
                jsonWriter.value(bool == null ? "null" : bool.toString());
                return;
            case 26:
                jsonWriter.value((Number) obj);
                return;
            case 27:
                jsonWriter.value((Number) obj);
                return;
            default:
                jsonWriter.value((Number) obj);
                return;
        }
    }
}
