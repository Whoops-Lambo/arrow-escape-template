package com.adsurge.adn.oversea_ad;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Dorado {
    public static final HashMap a = new HashMap();

    public static boolean a(String str, byte[] bArr) {
        Cygnus cygnus;
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        HashMap map = a;
        synchronized (map) {
            try {
                cygnus = (Cygnus) map.get(str);
                if (cygnus == null) {
                    cygnus = new Cygnus();
                    map.put(str, cygnus);
                }
                cygnus.b.incrementAndGet();
            } catch (Throwable th) {
                throw th;
            }
        }
        cygnus.a.writeLock().lock();
        FileLock fileLockLock = null;
        try {
            randomAccessFile = new RandomAccessFile(str, "rw");
            try {
                channel = randomAccessFile.getChannel();
                try {
                    fileLockLock = channel.lock();
                    randomAccessFile.seek(0L);
                    randomAccessFile.write(bArr);
                    randomAccessFile.setLength(bArr.length);
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    Octans.a(channel);
                    Octans.a(randomAccessFile);
                    HashMap map2 = a;
                    synchronized (map2) {
                        try {
                            cygnus.a.writeLock().unlock();
                            if (cygnus.b.decrementAndGet() == 0) {
                                map2.remove(str);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return true;
                } catch (Throwable unused2) {
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused3) {
                        }
                    }
                    Octans.a(channel);
                    Octans.a(randomAccessFile);
                    HashMap map3 = a;
                    synchronized (map3) {
                        try {
                            cygnus.a.writeLock().unlock();
                            if (cygnus.b.decrementAndGet() == 0) {
                                map3.remove(str);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return false;
                }
            } catch (Throwable unused4) {
                channel = null;
            }
        } catch (Throwable unused5) {
            randomAccessFile = null;
            channel = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b2 A[Catch: all -> 0x00b6, TryCatch #3 {all -> 0x00b6, blocks: (B:46:0x00a1, B:48:0x00b2, B:51:0x00b9), top: B:66:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable, java.nio.channels.FileChannel] */
    public static byte[] b(String str) {
        Cygnus cygnus;
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock;
        ?? channel;
        HashMap map;
        HashMap map2 = a;
        synchronized (map2) {
            try {
                cygnus = (Cygnus) map2.get(str);
                if (cygnus == null) {
                    cygnus = new Cygnus();
                    map2.put(str, cygnus);
                }
                cygnus.b.incrementAndGet();
            } catch (Throwable th) {
                throw th;
            }
        }
        cygnus.a.readLock().lock();
        try {
            randomAccessFile = new RandomAccessFile(str, "r");
            try {
                channel = randomAccessFile.getChannel();
                try {
                    fileLockLock = channel.lock(0L, Long.MAX_VALUE, true);
                    try {
                        long length = randomAccessFile.length();
                        int i = (int) length;
                        if (i != length) {
                            throw new IOException("");
                        }
                        byte[] bArr = new byte[i];
                        randomAccessFile.readFully(bArr);
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException unused) {
                            }
                        }
                        Octans.a(channel);
                        Octans.a(randomAccessFile);
                        HashMap map3 = a;
                        synchronized (map3) {
                            try {
                                cygnus.a.readLock().unlock();
                                if (cygnus.b.decrementAndGet() == 0) {
                                    map3.remove(str);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return bArr;
                    } catch (Throwable unused2) {
                        if (fileLockLock != null) {
                            try {
                                fileLockLock.release();
                            } catch (IOException unused3) {
                            }
                        }
                        Octans.a(channel);
                        Octans.a(randomAccessFile);
                        map = a;
                        synchronized (map) {
                            try {
                                cygnus.a.readLock().unlock();
                                if (cygnus.b.decrementAndGet() == 0) {
                                    map.remove(str);
                                }
                                return null;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable unused4) {
                    fileLockLock = null;
                }
            } catch (Throwable unused5) {
                fileLockLock = null;
                channel = fileLockLock;
                if (fileLockLock != null && fileLockLock.isValid()) {
                    fileLockLock.release();
                }
                Octans.a(channel);
                Octans.a(randomAccessFile);
                map = a;
                synchronized (map) {
                    cygnus.a.readLock().unlock();
                    if (cygnus.b.decrementAndGet() == 0) {
                        map.remove(str);
                    }
                }
                return null;
            }
        } catch (Throwable unused6) {
            randomAccessFile = null;
            fileLockLock = null;
        }
    }

    public static byte[] a(String str, int i) {
        FileInputStream fileInputStream;
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[i];
                int i2 = 0;
                do {
                    int i3 = fileInputStream.read(bArr, i2, i - i2);
                    if (i3 == -1) {
                        break;
                    }
                    i2 += i3;
                } while (i2 < i);
                if (i2 == 0) {
                    Octans.a(fileInputStream);
                    return null;
                }
                if (i2 < i) {
                    byte[] bArr2 = new byte[i2];
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                    bArr = bArr2;
                }
                Octans.a(fileInputStream);
                return bArr;
            } catch (Throwable unused) {
                Octans.a(fileInputStream);
                return null;
            }
        } catch (Throwable unused2) {
            fileInputStream = null;
        }
    }

    public static byte[] a(String str) {
        FileInputStream fileInputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(fileInputStream.available());
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (-1 == i) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray == null) {
                        byteArray = "".getBytes();
                    }
                    Octans.a(fileInputStream);
                    Octans.a(byteArrayOutputStream);
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        Octans.a(fileInputStream);
                        Octans.a(byteArrayOutputStream);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th5) {
            fileInputStream = null;
            th = th5;
            byteArrayOutputStream = null;
        }
    }

    public static void a(File file) {
        if (file.exists()) {
            try {
                if (!file.isDirectory()) {
                    file.delete();
                    return;
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        a(file2);
                    }
                }
                file.delete();
            } catch (Throwable unused) {
            }
        }
    }
}
