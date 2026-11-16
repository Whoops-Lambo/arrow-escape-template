package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class qm {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;
    public final Serializable d;

    public /* synthetic */ qm(String str, String str2, Serializable serializable, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = serializable;
    }

    public final ud a() {
        byte[] byteArray;
        byte[] byteArray2;
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                byte[] bArr = (byte[]) this.d;
                if (bArr == null || bArr.length == 0) {
                    byteArray = null;
                } else {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            try {
                                gZIPOutputStream.write(bArr);
                                gZIPOutputStream.finish();
                                byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (IOException unused) {
                        byteArray = null;
                    }
                }
                if (byteArray == null) {
                    return null;
                }
                return new ud(str, byteArray);
            default:
                byte[] bArr2 = new byte[8192];
                try {
                    InputStream inputStreamB = b();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream2);
                            if (inputStreamB != null) {
                                while (true) {
                                    try {
                                        int i2 = inputStreamB.read(bArr2);
                                        if (i2 > 0) {
                                            gZIPOutputStream2.write(bArr2, 0, i2);
                                        } else {
                                            gZIPOutputStream2.finish();
                                            byteArray2 = byteArrayOutputStream2.toByteArray();
                                            gZIPOutputStream2.close();
                                            byteArrayOutputStream2.close();
                                            inputStreamB.close();
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            gZIPOutputStream2.close();
                                            break;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                        }
                                        throw th5;
                                    }
                                    try {
                                        byteArrayOutputStream2.close();
                                        break;
                                    } catch (Throwable th7) {
                                        th.addSuppressed(th7);
                                    }
                                    throw th;
                                }
                            }
                            gZIPOutputStream2.close();
                            byteArrayOutputStream2.close();
                            if (inputStreamB != null) {
                                inputStreamB.close();
                            }
                            byteArray2 = null;
                        } catch (Throwable th8) {
                            byteArrayOutputStream2.close();
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        if (inputStreamB != null) {
                            try {
                                inputStreamB.close();
                            } catch (Throwable th10) {
                                th9.addSuppressed(th10);
                            }
                            break;
                        }
                        throw th9;
                    }
                } catch (IOException unused2) {
                }
                if (byteArray2 != null) {
                    return new ud(str, byteArray2);
                }
                return null;
        }
    }

    public final InputStream b() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                byte[] bArr = (byte[]) obj;
                if (bArr == null || bArr.length == 0) {
                    return null;
                }
                return new ByteArrayInputStream(bArr);
            default:
                File file = (File) obj;
                if (!file.exists() || !file.isFile()) {
                    return null;
                }
                try {
                    return new FileInputStream(file);
                } catch (FileNotFoundException unused) {
                    return null;
                }
        }
    }
}
