package com.adsurge.adn.p008b0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a implements d {
    @Override // com.adsurge.adn.p008b0.d
    public boolean a(b bVar) {
        String[] strArrG = com.adsurge.adn.Z.a.g();
        if (strArrG.length == 0) {
            return false;
        }
        for (StackTraceElement stackTraceElement : bVar.f) {
            String className = stackTraceElement.getClassName();
            for (String str : strArrG) {
                if (className.startsWith(str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
