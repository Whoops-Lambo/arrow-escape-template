package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo
class VersionedParcelStream extends VersionedParcel {
    public static final Charset m = Charset.forName("UTF-16");
    public final DataInputStream d;
    public final DataOutputStream e;
    public final DataInputStream f;
    public DataOutputStream g;
    public FieldBuffer h;
    public boolean i;
    public int j;
    public int k;
    public int l;

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence i() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean j(int i) {
        while (true) {
            try {
                int i2 = this.k;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                int i3 = this.j;
                int i4 = this.l;
                DataInputStream dataInputStream = this.d;
                if (i3 < i4) {
                    dataInputStream.skip(i4 - i3);
                }
                this.l = -1;
                int i5 = dataInputStream.readInt();
                this.j = 0;
                int i6 = i5 & 65535;
                if (i6 == 65535) {
                    i6 = dataInputStream.readInt();
                }
                this.k = (i5 >> 16) & 65535;
                this.l = i6;
            } catch (IOException unused) {
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final Parcelable m() {
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FieldBuffer {
        public final ByteArrayOutputStream a;
        public final DataOutputStream b;
        public final int c;
        public final DataOutputStream d;

        public FieldBuffer(int i, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.a = byteArrayOutputStream;
            this.b = new DataOutputStream(byteArrayOutputStream);
            this.c = i;
            this.d = dataOutputStream;
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void a() {
        FieldBuffer fieldBuffer = this.h;
        if (fieldBuffer != null) {
            try {
                if (fieldBuffer.a.size() != 0) {
                    FieldBuffer fieldBuffer2 = this.h;
                    DataOutputStream dataOutputStream = fieldBuffer2.d;
                    fieldBuffer2.b.flush();
                    ByteArrayOutputStream byteArrayOutputStream = fieldBuffer2.a;
                    int size = byteArrayOutputStream.size();
                    dataOutputStream.writeInt((fieldBuffer2.c << 16) | (size >= 65535 ? 65535 : size));
                    if (size >= 65535) {
                        dataOutputStream.writeInt(size);
                    }
                    byteArrayOutputStream.writeTo(dataOutputStream);
                }
                this.h = null;
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel b() {
        return new VersionedParcelStream(this.f, this.g, this.a, this.b, this.c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean g() {
        try {
            return this.f.readBoolean();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] h() {
        DataInputStream dataInputStream = this.f;
        try {
            int i = dataInputStream.readInt();
            if (i <= 0) {
                return null;
            }
            byte[] bArr = new byte[i];
            dataInputStream.readFully(bArr);
            return bArr;
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int k() {
        try {
            return this.f.readInt();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String n() {
        DataInputStream dataInputStream = this.f;
        try {
            int i = dataInputStream.readInt();
            if (i <= 0) {
                return null;
            }
            byte[] bArr = new byte[i];
            dataInputStream.readFully(bArr);
            return new String(bArr, m);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void q(boolean z, boolean z2) {
        if (z) {
            this.i = z2;
        } else {
            y.j("Serialization of this object is not allowed");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void r(boolean z) {
        try {
            this.g.writeBoolean(z);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void s(byte[] bArr) {
        DataOutputStream dataOutputStream = this.g;
        try {
            if (bArr == null) {
                dataOutputStream.writeInt(-1);
            } else {
                dataOutputStream.writeInt(bArr.length);
                this.g.write(bArr);
            }
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void t(CharSequence charSequence) {
        if (this.i) {
            return;
        }
        y.j("CharSequence cannot be written to an OutputStream");
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void u(int i) {
        try {
            this.g.writeInt(i);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void w(Parcelable parcelable) {
        if (this.i) {
            return;
        }
        y.j("Parcelables cannot be written to an OutputStream");
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void x(String str) {
        try {
            if (str == null) {
                this.g.writeInt(-1);
                return;
            }
            byte[] bytes = str.getBytes(m);
            this.g.writeInt(bytes.length);
            this.g.write(bytes);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    public VersionedParcelStream(InputStream inputStream, OutputStream outputStream, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        DataInputStream dataInputStream;
        super(arrayMap, arrayMap2, arrayMap3);
        this.j = 0;
        this.k = -1;
        this.l = -1;
        if (inputStream != null) {
            dataInputStream = new DataInputStream(new FilterInputStream(inputStream) { // from class: androidx.versionedparcelable.VersionedParcelStream.1
                @Override // java.io.FilterInputStream, java.io.InputStream
                public final int read(byte[] bArr, int i, int i2) throws IOException {
                    VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                    int i3 = versionedParcelStream.l;
                    if (i3 != -1 && versionedParcelStream.j >= i3) {
                        throw new IOException();
                    }
                    int i4 = super.read(bArr, i, i2);
                    if (i4 > 0) {
                        versionedParcelStream.j += i4;
                    }
                    return i4;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final long skip(long j) throws IOException {
                    VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                    int i = versionedParcelStream.l;
                    if (i != -1 && versionedParcelStream.j >= i) {
                        throw new IOException();
                    }
                    long jSkip = super.skip(j);
                    if (jSkip > 0) {
                        versionedParcelStream.j += (int) jSkip;
                    }
                    return jSkip;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final int read() throws IOException {
                    VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                    int i = versionedParcelStream.l;
                    if (i != -1 && versionedParcelStream.j >= i) {
                        throw new IOException();
                    }
                    int i2 = super.read();
                    versionedParcelStream.j++;
                    return i2;
                }
            });
        } else {
            dataInputStream = null;
        }
        this.d = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.e = dataOutputStream;
        this.f = dataInputStream;
        this.g = dataOutputStream;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void p(int i) {
        a();
        FieldBuffer fieldBuffer = new FieldBuffer(i, this.e);
        this.h = fieldBuffer;
        this.g = fieldBuffer.b;
    }
}
