package com.adsurge.adn.N0;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a extends IOException {
        public a() {
            super("APNG Format error");
        }
    }

    public static boolean a(com.adsurge.adn.R0.d dVar) {
        com.adsurge.adn.O0.a aVar = dVar instanceof com.adsurge.adn.O0.a ? (com.adsurge.adn.O0.a) dVar : new com.adsurge.adn.O0.a(dVar);
        try {
            if (!aVar.a("\u0089PNG") || !aVar.a("\r\n\u001a\n")) {
                throw new a();
            }
            while (aVar.available() > 0) {
                if (b(aVar) instanceof com.adsurge.adn.N0.a) {
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            if (e instanceof a) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    public static e b(com.adsurge.adn.O0.a aVar) throws IOException {
        e eVar;
        int iB = aVar.b();
        int iF = aVar.f();
        int iE = aVar.e();
        if (iE == com.adsurge.adn.N0.a.g) {
            eVar = new com.adsurge.adn.N0.a();
        } else if (iE == f.n) {
            eVar = new f();
        } else if (iE == g.f) {
            eVar = new g();
        } else if (iE == h.e) {
            eVar = new h();
        } else if (iE == i.e) {
            eVar = new i();
        } else if (iE == j.h) {
            eVar = new j();
        } else {
            eVar = new e();
        }
        eVar.d = iB;
        eVar.b = iE;
        eVar.a = iF;
        eVar.b(aVar);
        eVar.c = aVar.f();
        return eVar;
    }

    public static boolean a(File file) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                boolean zA = a(new com.adsurge.adn.R0.e(fileInputStream2));
                try {
                    fileInputStream2.close();
                    return zA;
                } catch (IOException e) {
                    e.printStackTrace();
                    return zA;
                }
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                if (fileInputStream == null) {
                    return false;
                }
                try {
                    fileInputStream.close();
                    return false;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static List a(com.adsurge.adn.O0.a aVar) {
        if (aVar.a("\u0089PNG") && aVar.a("\r\n\u001a\n")) {
            ArrayList arrayList = new ArrayList();
            while (aVar.available() > 0) {
                arrayList.add(b(aVar));
            }
            return arrayList;
        }
        throw new a();
    }
}
