package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class FibonacciBase extends JsObject {

    
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    private Boolean hoverMarkers;
    private String hoverMarkers1;

    public void setHovermarkers(Boolean hoverMarkers) {
        this.hoverMarkers = null;
        this.hoverMarkers1 = null;
        
        this.hoverMarkers = hoverMarkers;
    }


    public void setHovermarkers(String hoverMarkers1) {
        this.hoverMarkers = null;
        this.hoverMarkers1 = null;
        
        this.hoverMarkers1 = hoverMarkers1;
    }

    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setHoverstroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        
        this.color1 = color1;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setHoverstroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        
        this.color2 = color2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setHoverstroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        
        this.color3 = color3;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }

    private Stroke hoverTrend;
    private ColoredFill hoverTrend1;
    private String hoverTrend2;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setHovertrend(Stroke hoverTrend, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.hoverTrend = null;
        this.hoverTrend1 = null;
        this.hoverTrend2 = null;
        
        this.hoverTrend = hoverTrend;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.dashpattern = null;
        this.dashpattern1 = null;
        
        this.dashpattern1 = dashpattern1;
        this.lineJoin = null;
        this.lineJoin1 = null;
        
        this.lineJoin1 = lineJoin1;
        this.lineCap = null;
        this.lineCap1 = null;
        
        this.lineCap1 = lineCap1;
    }


    public void setHovertrend(ColoredFill hoverTrend1, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.hoverTrend = null;
        this.hoverTrend1 = null;
        this.hoverTrend2 = null;
        
        this.hoverTrend1 = hoverTrend1;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.dashpattern = null;
        this.dashpattern1 = null;
        
        this.dashpattern1 = dashpattern1;
        this.lineJoin = null;
        this.lineJoin1 = null;
        
        this.lineJoin1 = lineJoin1;
        this.lineCap = null;
        this.lineCap1 = null;
        
        this.lineCap1 = lineCap1;
    }


    public void setHovertrend(String hoverTrend2, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.hoverTrend = null;
        this.hoverTrend1 = null;
        this.hoverTrend2 = null;
        
        this.hoverTrend2 = hoverTrend2;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.dashpattern = null;
        this.dashpattern1 = null;
        
        this.dashpattern1 = dashpattern1;
        this.lineJoin = null;
        this.lineJoin1 = null;
        
        this.lineJoin1 = lineJoin1;
        this.lineCap = null;
        this.lineCap1 = null;
        
        this.lineCap1 = lineCap1;
    }

    private Boolean markers;
    private String markers1;

    public void setMarkers(Boolean markers) {
        this.markers = null;
        this.markers1 = null;
        
        this.markers = markers;
    }


    public void setMarkers(String markers1) {
        this.markers = null;
        this.markers1 = null;
        
        this.markers1 = markers1;
    }

    private Boolean selectMarkers;
    private String selectMarkers1;

    public void setSelectmarkers(Boolean selectMarkers) {
        this.selectMarkers = null;
        this.selectMarkers1 = null;
        
        this.selectMarkers = selectMarkers;
    }


    public void setSelectmarkers(String selectMarkers1) {
        this.selectMarkers = null;
        this.selectMarkers1 = null;
        
        this.selectMarkers1 = selectMarkers1;
    }

    private Stroke color4;
    private ColoredFill color5;
    private String color6;
    private Double thickness2;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    public void setSelectstroke(Stroke color4, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        
        this.color4 = color4;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        
        this.dashpattern2 = dashpattern2;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        
        this.lineJoin2 = lineJoin2;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        
        this.lineCap2 = lineCap2;
    }


    public void setSelectstroke(ColoredFill color5, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        
        this.color5 = color5;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        
        this.dashpattern2 = dashpattern2;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        
        this.lineJoin2 = lineJoin2;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        
        this.lineCap2 = lineCap2;
    }


    public void setSelectstroke(String color6, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        
        this.color6 = color6;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        
        this.dashpattern2 = dashpattern2;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        
        this.lineJoin2 = lineJoin2;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        
        this.lineCap2 = lineCap2;
    }

    private Stroke selectTrend;
    private ColoredFill selectTrend1;
    private String selectTrend2;
    private Double thickness3;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;

    public void setSelecttrend(Stroke selectTrend, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        this.selectTrend = null;
        this.selectTrend1 = null;
        this.selectTrend2 = null;
        
        this.selectTrend = selectTrend;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        
        this.dashpattern3 = dashpattern3;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        
        this.lineJoin3 = lineJoin3;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        
        this.lineCap3 = lineCap3;
    }


    public void setSelecttrend(ColoredFill selectTrend1, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        this.selectTrend = null;
        this.selectTrend1 = null;
        this.selectTrend2 = null;
        
        this.selectTrend1 = selectTrend1;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        
        this.dashpattern3 = dashpattern3;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        
        this.lineJoin3 = lineJoin3;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        
        this.lineCap3 = lineCap3;
    }


    public void setSelecttrend(String selectTrend2, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        this.selectTrend = null;
        this.selectTrend1 = null;
        this.selectTrend2 = null;
        
        this.selectTrend2 = selectTrend2;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        
        this.dashpattern3 = dashpattern3;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        
        this.lineJoin3 = lineJoin3;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        
        this.lineCap3 = lineCap3;
    }

    private Stroke color7;
    private ColoredFill color8;
    private String color9;
    private Double thickness4;
    private String dashpattern4;
    private StrokeLineJoin lineJoin4;
    private StrokeLineCap lineCap4;

    public void setStroke(Stroke color7, Double thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        
        this.color7 = color7;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        
        this.dashpattern4 = dashpattern4;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        
        this.lineJoin4 = lineJoin4;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        
        this.lineCap4 = lineCap4;
    }


    public void setStroke(ColoredFill color8, Double thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        
        this.color8 = color8;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        
        this.dashpattern4 = dashpattern4;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        
        this.lineJoin4 = lineJoin4;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        
        this.lineCap4 = lineCap4;
    }


    public void setStroke(String color9, Double thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        
        this.color9 = color9;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        
        this.dashpattern4 = dashpattern4;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        
        this.lineJoin4 = lineJoin4;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        
        this.lineCap4 = lineCap4;
    }

    private Stroke trend;
    private ColoredFill trend1;
    private String trend2;
    private Double thickness5;
    private String dashpattern5;
    private StrokeLineJoin lineJoin5;
    private StrokeLineCap lineCap5;

    public void setTrend(Stroke trend, Double thickness5, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        this.trend = null;
        this.trend1 = null;
        this.trend2 = null;
        
        this.trend = trend;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        
        this.thickness5 = thickness5;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        
        this.dashpattern5 = dashpattern5;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        
        this.lineJoin5 = lineJoin5;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        
        this.lineCap5 = lineCap5;
    }


    public void setTrend(ColoredFill trend1, Double thickness5, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        this.trend = null;
        this.trend1 = null;
        this.trend2 = null;
        
        this.trend1 = trend1;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        
        this.thickness5 = thickness5;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        
        this.dashpattern5 = dashpattern5;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        
        this.lineJoin5 = lineJoin5;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        
        this.lineCap5 = lineCap5;
    }


    public void setTrend(String trend2, Double thickness5, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        this.trend = null;
        this.trend1 = null;
        this.trend2 = null;
        
        this.trend2 = trend2;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        
        this.thickness5 = thickness5;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        
        this.dashpattern5 = dashpattern5;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        
        this.lineJoin5 = lineJoin5;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        
        this.lineCap5 = lineCap5;
    }

    private Base xScale;
    private StockScatterDateTime xScale1;

    public void setXscale(Base xScale) {
        this.xScale = null;
        this.xScale1 = null;
        
        this.xScale = xScale;
    }


    public void setXscale(StockScatterDateTime xScale1) {
        this.xScale = null;
        this.xScale1 = null;
        
        this.xScale1 = xScale1;
    }

    private Base yScale;

    public void setYscale(Base yScale) {
        this.yScale = yScale;
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: \"%s\",", color);
        }
        return "";
    }

    private String generateJShoverMarkers() {
        if (hoverMarkers != null) {
            return String.format(Locale.US, "hoverMarkers: %b,", hoverMarkers);
        }
        return "";
    }

    private String generateJShoverMarkers1() {
        if (hoverMarkers1 != null) {
            return String.format(Locale.US, "hoverMarkers: \"%s\",", hoverMarkers1);
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", (color1 != null) ? color1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: %s,", (color2 != null) ? color2.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: \"%s\",", color3);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: \"%s\",", dashpattern);
        }
        return "";
    }

    private String generateJSlineJoin() {
        if (lineJoin != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin != null) ? lineJoin.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap() {
        if (lineCap != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap != null) ? lineCap.generateJs() : "null");
        }
        return "";
    }

    private String generateJShoverTrend() {
        if (hoverTrend != null) {
            return String.format(Locale.US, "hoverTrend: %s,", (hoverTrend != null) ? hoverTrend.generateJs() : "null");
        }
        return "";
    }

    private String generateJShoverTrend1() {
        if (hoverTrend1 != null) {
            return String.format(Locale.US, "hoverTrend: %s,", (hoverTrend1 != null) ? hoverTrend1.generateJs() : "null");
        }
        return "";
    }

    private String generateJShoverTrend2() {
        if (hoverTrend2 != null) {
            return String.format(Locale.US, "hoverTrend: \"%s\",", hoverTrend2);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
        }
        return "";
    }

    private String generateJSdashpattern1() {
        if (dashpattern1 != null) {
            return String.format(Locale.US, "dashpattern: \"%s\",", dashpattern1);
        }
        return "";
    }

    private String generateJSlineJoin1() {
        if (lineJoin1 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin1 != null) ? lineJoin1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap1() {
        if (lineCap1 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap1 != null) ? lineCap1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmarkers() {
        if (markers != null) {
            return String.format(Locale.US, "markers: %b,", markers);
        }
        return "";
    }

    private String generateJSmarkers1() {
        if (markers1 != null) {
            return String.format(Locale.US, "markers: \"%s\",", markers1);
        }
        return "";
    }

    private String generateJSselectMarkers() {
        if (selectMarkers != null) {
            return String.format(Locale.US, "selectMarkers: %b,", selectMarkers);
        }
        return "";
    }

    private String generateJSselectMarkers1() {
        if (selectMarkers1 != null) {
            return String.format(Locale.US, "selectMarkers: \"%s\",", selectMarkers1);
        }
        return "";
    }

    private String generateJScolor4() {
        if (color4 != null) {
            return String.format(Locale.US, "color: %s,", (color4 != null) ? color4.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor5() {
        if (color5 != null) {
            return String.format(Locale.US, "color: %s,", (color5 != null) ? color5.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor6() {
        if (color6 != null) {
            return String.format(Locale.US, "color: \"%s\",", color6);
        }
        return "";
    }

    private String generateJSthickness2() {
        if (thickness2 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness2);
        }
        return "";
    }

    private String generateJSdashpattern2() {
        if (dashpattern2 != null) {
            return String.format(Locale.US, "dashpattern: \"%s\",", dashpattern2);
        }
        return "";
    }

    private String generateJSlineJoin2() {
        if (lineJoin2 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin2 != null) ? lineJoin2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap2() {
        if (lineCap2 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap2 != null) ? lineCap2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectTrend() {
        if (selectTrend != null) {
            return String.format(Locale.US, "selectTrend: %s,", (selectTrend != null) ? selectTrend.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectTrend1() {
        if (selectTrend1 != null) {
            return String.format(Locale.US, "selectTrend: %s,", (selectTrend1 != null) ? selectTrend1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectTrend2() {
        if (selectTrend2 != null) {
            return String.format(Locale.US, "selectTrend: \"%s\",", selectTrend2);
        }
        return "";
    }

    private String generateJSthickness3() {
        if (thickness3 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness3);
        }
        return "";
    }

    private String generateJSdashpattern3() {
        if (dashpattern3 != null) {
            return String.format(Locale.US, "dashpattern: \"%s\",", dashpattern3);
        }
        return "";
    }

    private String generateJSlineJoin3() {
        if (lineJoin3 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin3 != null) ? lineJoin3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap3() {
        if (lineCap3 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap3 != null) ? lineCap3.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor7() {
        if (color7 != null) {
            return String.format(Locale.US, "color: %s,", (color7 != null) ? color7.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor8() {
        if (color8 != null) {
            return String.format(Locale.US, "color: %s,", (color8 != null) ? color8.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor9() {
        if (color9 != null) {
            return String.format(Locale.US, "color: \"%s\",", color9);
        }
        return "";
    }

    private String generateJSthickness4() {
        if (thickness4 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness4);
        }
        return "";
    }

    private String generateJSdashpattern4() {
        if (dashpattern4 != null) {
            return String.format(Locale.US, "dashpattern: \"%s\",", dashpattern4);
        }
        return "";
    }

    private String generateJSlineJoin4() {
        if (lineJoin4 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin4 != null) ? lineJoin4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap4() {
        if (lineCap4 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap4 != null) ? lineCap4.generateJs() : "null");
        }
        return "";
    }

    private String generateJStrend() {
        if (trend != null) {
            return String.format(Locale.US, "trend: %s,", (trend != null) ? trend.generateJs() : "null");
        }
        return "";
    }

    private String generateJStrend1() {
        if (trend1 != null) {
            return String.format(Locale.US, "trend: %s,", (trend1 != null) ? trend1.generateJs() : "null");
        }
        return "";
    }

    private String generateJStrend2() {
        if (trend2 != null) {
            return String.format(Locale.US, "trend: \"%s\",", trend2);
        }
        return "";
    }

    private String generateJSthickness5() {
        if (thickness5 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness5);
        }
        return "";
    }

    private String generateJSdashpattern5() {
        if (dashpattern5 != null) {
            return String.format(Locale.US, "dashpattern: \"%s\",", dashpattern5);
        }
        return "";
    }

    private String generateJSlineJoin5() {
        if (lineJoin5 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin5 != null) ? lineJoin5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap5() {
        if (lineCap5 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap5 != null) ? lineCap5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSxScale() {
        if (xScale != null) {
            return String.format(Locale.US, "xScale: %s,", (xScale != null) ? xScale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSxScale1() {
        if (xScale1 != null) {
            return String.format(Locale.US, "xScale: %s,", (xScale1 != null) ? xScale1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSyScale() {
        if (yScale != null) {
            return String.format(Locale.US, "yScale: %s,", (yScale != null) ? yScale.generateJs() : "null");
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJScolor());
        js.append(generateJShoverMarkers());
        js.append(generateJShoverMarkers1());
        js.append(generateJScolor1());
        js.append(generateJScolor2());
        js.append(generateJScolor3());
        js.append(generateJSthickness());
        js.append(generateJSdashpattern());
        js.append(generateJSlineJoin());
        js.append(generateJSlineCap());
        js.append(generateJShoverTrend());
        js.append(generateJShoverTrend1());
        js.append(generateJShoverTrend2());
        js.append(generateJSthickness1());
        js.append(generateJSdashpattern1());
        js.append(generateJSlineJoin1());
        js.append(generateJSlineCap1());
        js.append(generateJSmarkers());
        js.append(generateJSmarkers1());
        js.append(generateJSselectMarkers());
        js.append(generateJSselectMarkers1());
        js.append(generateJScolor4());
        js.append(generateJScolor5());
        js.append(generateJScolor6());
        js.append(generateJSthickness2());
        js.append(generateJSdashpattern2());
        js.append(generateJSlineJoin2());
        js.append(generateJSlineCap2());
        js.append(generateJSselectTrend());
        js.append(generateJSselectTrend1());
        js.append(generateJSselectTrend2());
        js.append(generateJSthickness3());
        js.append(generateJSdashpattern3());
        js.append(generateJSlineJoin3());
        js.append(generateJSlineCap3());
        js.append(generateJScolor7());
        js.append(generateJScolor8());
        js.append(generateJScolor9());
        js.append(generateJSthickness4());
        js.append(generateJSdashpattern4());
        js.append(generateJSlineJoin4());
        js.append(generateJSlineCap4());
        js.append(generateJStrend());
        js.append(generateJStrend1());
        js.append(generateJStrend2());
        js.append(generateJSthickness5());
        js.append(generateJSdashpattern5());
        js.append(generateJSlineJoin5());
        js.append(generateJSlineCap5());
        js.append(generateJSxScale());
        js.append(generateJSxScale1());
        js.append(generateJSyScale());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}