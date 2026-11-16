package androidx.emoji2.text.flatbuffer;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4664b4;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class FlexBuffers {
    public static final ArrayReadWriteBuf a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Blob extends Sized {
        public static final Blob e = new Blob(FlexBuffers.a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final StringBuilder a(StringBuilder sb) {
            sb.append('\"');
            sb.append(this.a.a(this.b, this.d));
            sb.append('\"');
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final String toString() {
            return this.a.a(this.b, this.d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Key extends Object {
        public static final Key d = new Key(FlexBuffers.a, 0, 0);

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return key.b == this.b && key.c == this.c;
        }

        public final int hashCode() {
            return this.c ^ this.b;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final String toString() {
            int i = this.b;
            int i2 = i;
            while (true) {
                ReadBuf readBuf = this.a;
                if (readBuf.get(i2) == 0) {
                    return readBuf.a(i, i2 - i);
                }
                i2++;
            }
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final StringBuilder a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class KeyVector {
        public final TypedVector a;

        public final String toString() {
            TypedVector typedVector = this.a;
            int i = typedVector.d;
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i2 = 0; i2 < i; i2++) {
                typedVector.b(i2).d(sb);
                if (i2 != i - 1) {
                    sb.append(", ");
                }
            }
            sb.append(C4664b4.j.e);
            return sb.toString();
        }

        public KeyVector(TypedVector typedVector) {
            this.a = typedVector;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Map extends Vector {
        public static final Map f = new Map(FlexBuffers.a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final StringBuilder a(StringBuilder sb) {
            Key key;
            sb.append("{ ");
            int i = this.c;
            int i2 = this.b;
            int i3 = i2 - (i * 3);
            ReadBuf readBuf = this.a;
            KeyVector keyVector = new KeyVector(new TypedVector(readBuf, FlexBuffers.a(readBuf, i3, i), (int) FlexBuffers.c(readBuf, i3 + i, i), 4));
            Vector vector = new Vector(readBuf, i2, i);
            int i4 = 0;
            while (true) {
                int i5 = this.d;
                if (i4 >= i5) {
                    sb.append(" }");
                    return sb;
                }
                sb.append('\"');
                TypedVector typedVector = keyVector.a;
                int i6 = typedVector.d;
                int i7 = typedVector.c;
                if (i4 >= i6) {
                    key = Key.d;
                } else {
                    int i8 = (i4 * i7) + typedVector.b;
                    ReadBuf readBuf2 = typedVector.a;
                    key = new Key(readBuf2, FlexBuffers.a(readBuf2, i8, i7), 1);
                }
                sb.append(key.toString());
                sb.append("\" : ");
                sb.append(vector.b(i4).toString());
                if (i4 != i5 - 1) {
                    sb.append(", ");
                }
                i4++;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Object {
        public final ReadBuf a;
        public final int b;
        public final int c;

        public abstract StringBuilder a(StringBuilder sb);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }

        public Object(ReadBuf readBuf, int i, int i2) {
            this.a = readBuf;
            this.b = i;
            this.c = i2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Reference {
        public static final Reference f = new Reference(FlexBuffers.a, 0, 1, 0);
        public final ReadBuf a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public final String a() {
            int i = this.d;
            int i2 = this.b;
            ReadBuf readBuf = this.a;
            int i3 = this.e;
            if (i3 == 5) {
                int iA = FlexBuffers.a(readBuf, i2, this.c);
                return readBuf.a(iA, (int) FlexBuffers.d(readBuf, iA - i, i));
            }
            if (i3 != 4) {
                return "";
            }
            int iA2 = FlexBuffers.a(readBuf, i2, i);
            int i4 = iA2;
            while (readBuf.get(i4) != 0) {
                i4++;
            }
            return readBuf.a(iA2, i4 - iA2);
        }

        public final long b() {
            int i = this.b;
            ReadBuf readBuf = this.a;
            int i2 = this.c;
            int i3 = this.e;
            if (i3 == 2) {
                return FlexBuffers.d(readBuf, i, i2);
            }
            if (i3 == 1) {
                return FlexBuffers.c(readBuf, i, i2);
            }
            if (i3 == 3) {
                return (long) FlexBuffers.b(readBuf, i, i2);
            }
            if (i3 == 10) {
                return c().d;
            }
            if (i3 == 26) {
                return (int) FlexBuffers.c(readBuf, i, i2);
            }
            if (i3 == 5) {
                return Long.parseLong(a());
            }
            int i4 = this.d;
            if (i3 == 6) {
                return FlexBuffers.c(readBuf, FlexBuffers.a(readBuf, i, i2), i4);
            }
            if (i3 == 7) {
                return FlexBuffers.d(readBuf, FlexBuffers.a(readBuf, i, i2), i4);
            }
            if (i3 != 8) {
                return 0L;
            }
            return (long) FlexBuffers.b(readBuf, FlexBuffers.a(readBuf, i, i2), i2);
        }

        public Reference(ReadBuf readBuf, int i, int i2, int i3) {
            this(readBuf, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public final Vector c() {
            int i = this.d;
            int i2 = this.c;
            int i3 = this.b;
            ReadBuf readBuf = this.a;
            int i4 = this.e;
            if (i4 == 10 || i4 == 9) {
                return new Vector(readBuf, FlexBuffers.a(readBuf, i3, i2), i);
            }
            if (i4 == 15) {
                return new TypedVector(readBuf, FlexBuffers.a(readBuf, i3, i2), i, 4);
            }
            return ((i4 < 11 || i4 > 15) && i4 != 36) ? Vector.e : new TypedVector(readBuf, FlexBuffers.a(readBuf, i3, i2), i, i4 - 10);
        }

        /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
        public final StringBuilder d(StringBuilder sb) {
            long jD;
            double dB;
            int iC;
            long jC;
            int i;
            double dB2;
            long jD2;
            int i2 = this.e;
            if (i2 != 36) {
                boolean z = true;
                int i3 = this.d;
                int i4 = this.c;
                int i5 = this.b;
                ReadBuf readBuf = this.a;
                switch (i2) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        if (i2 == 1) {
                            jD = FlexBuffers.c(readBuf, i5, i4);
                        } else if (i2 != 2) {
                            if (i2 == 3) {
                                dB = FlexBuffers.b(readBuf, i5, i4);
                            } else if (i2 == 5) {
                                try {
                                    jD = Long.parseLong(a());
                                } catch (NumberFormatException unused) {
                                    jD = 0;
                                }
                                break;
                            } else if (i2 == 6) {
                                jD = FlexBuffers.c(readBuf, FlexBuffers.a(readBuf, i5, i4), i3);
                            } else if (i2 == 7) {
                                jD = FlexBuffers.d(readBuf, FlexBuffers.a(readBuf, i5, i4), i4);
                            } else if (i2 != 8) {
                                if (i2 == 10) {
                                    iC = c().d;
                                } else if (i2 != 26) {
                                    jD = 0;
                                } else {
                                    iC = (int) FlexBuffers.c(readBuf, i5, i4);
                                }
                                jD = iC;
                            } else {
                                dB = FlexBuffers.b(readBuf, FlexBuffers.a(readBuf, i5, i4), i3);
                            }
                            jD = (long) dB;
                        } else {
                            jD = FlexBuffers.d(readBuf, i5, i4);
                        }
                        sb.append(jD);
                        return sb;
                    case 2:
                    case 7:
                        sb.append(b());
                        return sb;
                    case 3:
                    case 8:
                        if (i2 == 3) {
                            dB2 = FlexBuffers.b(readBuf, i5, i4);
                        } else {
                            if (i2 == 1) {
                                jC = FlexBuffers.c(readBuf, i5, i4);
                            } else if (i2 == 2) {
                                jD2 = FlexBuffers.d(readBuf, i5, i4);
                                dB2 = jD2;
                            } else if (i2 == 5) {
                                dB2 = Double.parseDouble(a());
                            } else if (i2 == 6) {
                                jC = FlexBuffers.c(readBuf, FlexBuffers.a(readBuf, i5, i4), i3);
                            } else if (i2 == 7) {
                                jD2 = FlexBuffers.d(readBuf, FlexBuffers.a(readBuf, i5, i4), i3);
                                dB2 = jD2;
                            } else if (i2 == 8) {
                                dB2 = FlexBuffers.b(readBuf, FlexBuffers.a(readBuf, i5, i4), i3);
                            } else if (i2 == 10) {
                                i = c().d;
                                dB2 = i;
                            } else if (i2 != 26) {
                                dB2 = 0.0d;
                            } else {
                                jD2 = FlexBuffers.d(readBuf, i5, i4);
                                dB2 = jD2;
                            }
                            i = (int) jC;
                            dB2 = i;
                        }
                        sb.append(dB2);
                        return sb;
                    case 4:
                        Key key = i2 == 4 ? new Key(readBuf, FlexBuffers.a(readBuf, i5, i4), i3) : Key.d;
                        sb.append('\"');
                        key.a(sb);
                        sb.append('\"');
                        return sb;
                    case 5:
                        sb.append('\"');
                        sb.append(a());
                        sb.append('\"');
                        return sb;
                    case 9:
                        (i2 == 9 ? new Map(readBuf, FlexBuffers.a(readBuf, i5, i4), i3) : Map.f).a(sb);
                        return sb;
                    case 10:
                        c().a(sb);
                        return sb;
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException(pv1.k(i2, "not_implemented:"));
                    case 25:
                        ((i2 == 25 || i2 == 5) ? new Blob(readBuf, FlexBuffers.a(readBuf, i5, i4), i3) : Blob.e).a(sb);
                        return sb;
                    case 26:
                        if (i2 != 26 ? b() == 0 : readBuf.get(i5) == 0) {
                            z = false;
                        }
                        sb.append(z);
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(c());
            return sb;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            d(sb);
            return sb.toString();
        }

        public Reference(ReadBuf readBuf, int i, int i2, int i3, int i4) {
            this.a = readBuf;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class TypedVector extends Vector {
        public final int f;

        static {
            new TypedVector(FlexBuffers.a, 1, 1, 1);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public final Reference b(int i) {
            if (i >= this.d) {
                return Reference.f;
            }
            return new Reference(this.a, (i * this.c) + this.b, this.c, 1, this.f);
        }

        public TypedVector(ReadBuf readBuf, int i, int i2, int i3) {
            super(readBuf, i, i2);
            this.f = i3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Unsigned {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Vector extends Sized {
        public static final Vector e = new Vector(FlexBuffers.a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder a(StringBuilder sb) {
            sb.append("[ ");
            int i = 0;
            while (true) {
                int i2 = this.d;
                if (i >= i2) {
                    sb.append(" ]");
                    return sb;
                }
                b(i).d(sb);
                if (i != i2 - 1) {
                    sb.append(", ");
                }
                i++;
            }
        }

        public Reference b(int i) {
            long j = this.d;
            long j2 = i;
            if (j2 >= j) {
                return Reference.f;
            }
            int i2 = this.b;
            int i3 = this.c;
            long j3 = j * ((long) i3);
            ReadBuf readBuf = this.a;
            return new Reference(readBuf, (i * i3) + i2, i3, readBuf.get((int) (j3 + ((long) i2) + j2)) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
    }

    public static int a(ReadBuf readBuf, int i, int i2) {
        return (int) (((long) i) - d(readBuf, i, i2));
    }

    public static double b(ReadBuf readBuf, int i, int i2) {
        if (i2 == 4) {
            return readBuf.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i);
    }

    public static long c(ReadBuf readBuf, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = readBuf.get(i);
        } else if (i2 == 2) {
            i3 = readBuf.getShort(i);
        } else {
            if (i2 != 4) {
                if (i2 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i);
            }
            i3 = readBuf.getInt(i);
        }
        return i3;
    }

    public static long d(ReadBuf readBuf, int i, int i2) {
        if (i2 == 1) {
            return readBuf.get(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        if (i2 == 2) {
            return readBuf.getShort(i) & 65535;
        }
        if (i2 == 4) {
            return ((long) readBuf.getInt(i)) & 4294967295L;
        }
        if (i2 != 8) {
            return -1L;
        }
        return readBuf.getLong(i);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Sized extends Object {
        public final int d;

        public Sized(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
            this.d = (int) FlexBuffers.c(readBuf, i - i2, i2);
        }
    }

    static {
        ArrayReadWriteBuf arrayReadWriteBuf = new ArrayReadWriteBuf();
        arrayReadWriteBuf.a = new byte[]{0};
        a = arrayReadWriteBuf;
    }
}
