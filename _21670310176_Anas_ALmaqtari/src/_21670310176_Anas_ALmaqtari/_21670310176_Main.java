package _21670310176_Anas_ALmaqtari;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import _21670310176_Anas_ALmaqtari._21670310176_dosyaOkuma;
public class _21670310176_Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        _21670310176_FST fst = new _21670310176_FST();
        String dosya = "FST.txt";
        _21670310176_dosyaOkuma.dosyaAcmaVeOkuma(fst, dosya); 
        System.out.println("FST.txt dosyası okundu.");
        
        
        System.out.println("Lütfen birinci input'u giriniz:");
        String input1 = scanner.nextLine();
        _21670310176_girlenInputIslemleri.girilenInputIslemleri(fst, input1);

        System.out.println("Lütfen ikinci input'u giriniz:");
        String input2 = scanner.nextLine();
        _21670310176_girlenInputIslemleri.girilenInputIslemleri(fst, input2);
        
    }
}