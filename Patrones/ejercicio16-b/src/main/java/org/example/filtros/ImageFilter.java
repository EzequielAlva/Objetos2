package org.example.filtros;

import java.awt.image.BufferedImage;


public interface ImageFilter {
    
    public BufferedImage filter(BufferedImage image);
    
}
