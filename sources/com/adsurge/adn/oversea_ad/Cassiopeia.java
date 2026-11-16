package com.adsurge.adn.oversea_ad;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Cassiopeia implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (Pattern.matches("cpu[0-9]", file.getName())) {
            return true;
        }
        return false;
    }
}
