package ru.vvdev.yamap;

import android.graphics.PointF;
import android.view.View;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;

import java.util.Map;
import java.util.HashMap;

import javax.annotation.Nonnull;

public class EnergoImageCache {
    public static Map<String, ImageProvider> images = new HashMap<String, ImageProvider>();

    EnergoImageCache() {}

    public static ImageProvider get(String url) {
        return images.get(url);
    }

    public static void put(String url, ImageProvider provider) {
        images.put(url, provider);
    }
}
