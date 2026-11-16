package com.adsurge.adn.x1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Movie;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public int a;
        public int b;
        public boolean c;

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }
    }

    public static boolean b(File file) throws Throwable {
        FileInputStream fileInputStream;
        byte b;
        boolean z = false;
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            file.getAbsolutePath();
            return false;
        }
        if (file.length() < 6) {
            file.getAbsolutePath();
            file.length();
            return false;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[6];
                    if (fileInputStream.read(bArr) < 6) {
                        file.getAbsolutePath();
                        try {
                            fileInputStream.close();
                            return false;
                        } catch (Exception e) {
                            e.getMessage();
                            return false;
                        }
                    }
                    if (bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 56 && (((b = bArr[4]) == 55 || b == 57) && bArr[5] == 97)) {
                        z = true;
                    }
                    try {
                        fileInputStream.close();
                        return z;
                    } catch (Exception e2) {
                        e2.getMessage();
                        return z;
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileInputStream2 = fileInputStream;
                    e.getMessage();
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Exception e4) {
                            e4.getMessage();
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e5) {
                            e5.getMessage();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    public static Movie a(File file) {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Movie movieDecodeByteArray;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!b(file)) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(1024);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    movieDecodeByteArray = Movie.decodeByteArray(byteArray, 0, byteArray.length);
                    try {
                        fileInputStream.close();
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception e2) {
                        e = e2;
                        e.getMessage();
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.getMessage();
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e3) {
                                e3.getMessage();
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception e4) {
                                e = e4;
                                movieDecodeByteArray = null;
                                e.getMessage();
                            }
                        }
                        movieDecodeByteArray = null;
                    } catch (Throwable th2) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e5) {
                                e5.getMessage();
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                                throw th2;
                            } catch (Exception e6) {
                                e6.getMessage();
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            byteArrayOutputStream = null;
        }
        if (movieDecodeByteArray != null) {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            float length = file.length() / 1024.0f;
            int iWidth = movieDecodeByteArray.width();
            int iHeight = movieDecodeByteArray.height();
            String.format("![%.2fKB, %d*%d, len=%dms, cost=%dms](%s)", Float.valueOf(length), Integer.valueOf(iWidth), Integer.valueOf(iHeight), Integer.valueOf(movieDecodeByteArray.duration()), Long.valueOf(jElapsedRealtime2), file.getAbsoluteFile());
            if (iWidth == 0 || iHeight == 0) {
                return null;
            }
        }
        return movieDecodeByteArray;
    }

    public static Bitmap a(File file, ImageView imageView, boolean z) {
        return a(file.getAbsolutePath(), imageView);
    }

    public static Bitmap a(String str, ImageView imageView) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        BitmapFactory.decodeFile(str, options);
        a aVarA = a(imageView, options.outWidth, options.outHeight);
        options.inSampleSize = a(options, aVarA.a, aVarA.b);
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        return aVarA.c ? a(bitmapDecodeFile, aVarA.a, aVarA.b) : bitmapDecodeFile;
    }

    public static int a(BitmapFactory.Options options, int i, int i2) {
        return a(options.outWidth, options.outHeight, i, i2);
    }

    public static int a(int i, int i2, int i3, int i4) {
        if (i > i3 || i2 > i4) {
            return Math.max(Math.round((i * 1.0f) / i3), Math.round((i2 * 1.0f) / i4));
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0042 A[PHI: r2 r3
  0x0042: PHI (r2v1 int) = (r2v0 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:5:0x0014, B:14:0x0024, B:15:0x0026, B:27:0x0044, B:29:0x0048, B:31:0x004c, B:25:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r3v5 int) = (r3v4 int), (r3v6 int), (r3v6 int), (r3v6 int), (r3v6 int), (r3v6 int), (r3v7 int) binds: [B:5:0x0014, B:14:0x0024, B:15:0x0026, B:27:0x0044, B:29:0x0048, B:31:0x004c, B:25:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    public static a a(ImageView imageView, int i, int i2) {
        int iA;
        int i3;
        int i4;
        a aVar = new a();
        int iB = 0;
        if (imageView != null) {
            int width = imageView.getWidth();
            iA = imageView.getHeight();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                iB = width;
            } else {
                if (width <= 0 && (i4 = layoutParams.width) > 0) {
                    width = i4;
                }
                if (iA <= 0 && (i3 = layoutParams.height) > 0) {
                    iA = i3;
                }
                if (i <= 0 || i2 <= 0) {
                    iB = width;
                } else {
                    if (width > 0 && layoutParams.width != -2 && layoutParams.height == -2) {
                        int iRound = Math.round((i2 * width) / i);
                        aVar.c = i > width;
                        iA = iRound;
                    } else if (iA > 0 && layoutParams.height != -2 && layoutParams.width == -2) {
                        int iRound2 = Math.round((i * iA) / i2);
                        aVar.c = i2 > iA;
                        iB = iRound2;
                    }
                    iB = width;
                }
            }
        } else {
            iA = 0;
        }
        Context contextA = com.adsurge.adn.s1.a.b().a();
        if (iB <= 0) {
            iB = com.adsurge.adn.I0.i.b(contextA);
        }
        if (iA <= 0) {
            iA = com.adsurge.adn.I0.i.a(contextA);
        }
        aVar.a = iB;
        aVar.b = iA;
        return aVar;
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null || i == 0 || i2 == 0) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == i && i2 == height) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Bitmap a(File file, ImageView imageView) {
        return a(file, imageView, false);
    }

    public static com.adsurge.adn.M0.a a(File file, String str) {
        if (file != null && file.exists() && com.adsurge.adn.N0.d.a(file)) {
            return com.adsurge.adn.M0.a.a(file, str);
        }
        return null;
    }
}
