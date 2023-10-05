package Scene;

//import Manager.GameManager;
import domain.User;
import service.UserService;

import javax.swing.*;

public class Ending extends Scene{

    UserService userService = null;
    String Line;
    String Space;
    String King;
    String Rich;
    String Artist;
    String DarkKing;
    String PigparmCEO;

    @Override
    public void initialize() {

        userService = new UserService();

        Line = "                      ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺";

        Space = "                                            ";

        King =
                "\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠷⢾⡗⠷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣤⢤⣤⣖⣖⡾⢗⣖⣢⣤⢤⣦⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣯⡟⠉⣷⣿⣥⣴⣿⣿⣦⣾⣟⣏⠙⢿⣳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣧⣾⡟⣿⣽⣿⣿⣿⣿⣿⡿⣿⣻⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⢰⣿⣧⡄⠀⠀⠀⠀⠀⠀⠈⢾⣿⣛⣿⣧⡾⣷⣿⢾⣿⣿⣻⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⣼⡟⠟⠁⠐⠈⠘⠉⠉⠑⠻⣟⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⢰⣷⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀  ⢸⣷⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⢀⣼⠜⡇⠀⠀⠀⠀⢀⠀⠀⠀⠀  ⢈⡿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⢸⡇⠀⢱⡀⠈⠃⠀⢸⠀⠈⠃⠀⡸⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣇⠀⠀⠀⠀⢠⣾⡁⠀⠀⢧⠀⠀⠒⠚⠒⠂⠀⣰⠃⠀⣸⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⣸⣿⣧⡀⠀⠈⠳⢄⡀⠀⠀⣀⡴⠁⠀⣰⣟⣯⡿⣇⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⢀⣴⣾⣿⣿⢟⠘⣶⣤⣀⠀⠈⠉⠉⠀⣀⣤⣾⡇⠈⠙⢿⣏⣺⣆⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣤⣾⣿⣴⠟⠁⠀⠀⠙⠿⣟⣿⡟⣷⣮⢿⣿⡻⠋⠀⠀⠈⠀⠈⠛⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣷⣿⣿⢁⠀⠀⠀⠀⠀⠈⠈⢿⣿⡛⠻⣿⡟⠄⢈⠀⢈⠀⠀⡁⣤⣾⠿⢿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⠀⠀⣴⣾⣿⣿⣿⢉⢩⢿⣷⣦⣤⣀⢀⠀⠀⢸⣿⣴⣤⣿⢦⠀⣠⢀⢤⣵⣿⠿⠛⢻⡄⠀⠙⢻⣦⡄⠀⠀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⠀⢀⣤⣿⢿⠟⢉⣿⠘⠂⠀⠁⠓⣾⠻⣿⣿⣶⣿⣵⣿⣿⣾⣾⣷⣟⠿⠁⠺⢀⠀⠀⠀⠀⠀⢀⠴⢿⣿⣦⡀⠀⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⠀⢀⣸⣿⣿⠟⠓⠦⣿⡆⠀⠀⠀⠀⠂⠀⢀⣱⡻⣏⣿⢿⣿⢿⠍⡿⣑⢄⡀⠀⠁⠀⠠⠀⣠⣶⠃⠶⠀⠘⠻⣷⣤⠀⠀⠀⠀\n" +
                "                              ⠀⠀⠀⢀⣼⣿⣿⣧⣆⡈⠈⣿⣏⡖⠀⠀⠀⢀⡤⠿⠀⠓⠃⠀⣾⣿⣆⠈⠉⢀⠠⠭⠲⣄⡀⠐⠾⣷⡇⠀⠀⡀⢨⠰⠽⢿⣧⡄⠀⠀\n" +
                "                              ⠀⠀⠀⣿⣿⡏⡄⢹⠉⠀⣀⣿⣿⠀⠀⢀⠴⢻⠀⠠⠊⠀⠀⠐⣿⣿⠟⠃⠂⠀⠢⠀⢸⠃⠙⠦⣄⠈⠳⢆⠀⢰⡌⠁⠄⠀⢹⣿⠀⠀\n" +
                "                              ⠀⠀⢰⣿⠋⢙⠇⣀⠀⢓⡜⠉⣿⠀⣠⡋⠐⠈⣇⠠⠚⢁⡆⡀⣹⣿⡠⢴⠂⠈⠀⢀⡏⠀⢀⢛⣿⣶⡄⠀⠙⣤⡁⠀⠀⠀⠀⠹⣄⠀\n" +
                "                              ⠀⠀⢸⣧⠠⣼⡆⢠⣄⠎⠀⠀⣿⣿⢻⡇⠠⠀⢸⡄⠍⠀⠘⠁⢿⣿⠀⠘⠀⣼⣿⣸⣁⠠⢠⣿⡿⠻⢿⣆⠀⠈⠳⡄⡃⢀⡀⣤⡟⡄\n" +
                "                              ⠀⡰⠃⠈⠀⠉⡟⡱⠋⢀⠀⢠⣾⣿⡼⡇⠀⠈⠘⡆⠀⠀⠐⠀⣿⣷⠆⠐⠆⢈⠈⡟⡿⣷⣿⣿⡤⢀⠂⠈⢆⠈⠀⠵⡞⠁⠉⠙⠖⢻\n" +
                "                              ⢠⠁⠀⠀⠀⠀⢰⠃⠀⠀⢀⠿⠿⡿⠛⡇⣀⣤⣤⣿⡁⢸⡤⠈⢿⣿⠋⠀⡄⠀⣻⣷⣴⣿⡿⠯⣛⠿⣷⣦⢸⠀⠄⠀⢹⡤⡀⡀⠋⢪\n" +
                "                              ⣷⣀⠀⢀⢀⣀⠏⠀⠀⠀⠎⢀⣠⣷⣀⣹⠁⢤⠛⠻⣿⣧⡀⢲⢿⣿⠶⠂⣠⣿⣿⣿⣿⣿⣷⢀⡈⢳⣭⡼⡗⠀⠀⠂⠀⡃⡁⢉⡀⣉\n";

        Rich =
                "\n" +
                "                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣴⣶⣶⣶⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                          ⠀⠀⠀⠀⠀⠀⣀⣤⣾⣿⡿⠿⠛⠛⠛⠛⠛⠛⠻⢿⣿⣿⣦⣄⠀⠀⠀⠀⠀⠀\n" +
                "                                          ⠀⠀⠀⠀⢠⣼⣿⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠈⠙⠿⣿⣷⣄⠀⠀⠀⠀\n" +
                "                                          ⠀⠀⠀⣰⣿⡿⠋⠀⠀⠀⠀⠀⣿⡇⠀⢸⣿⡇⠀⠀⠀⠀⠀  ⠈⢿⣿⣦⡀⠀⠀\n" +
                "                                          ⠀⠀⣸⣿⡿⠀⠀⠀⠸⠿⣿⣿⣿⡿⠿⠿⣿⣿⣿⣶⣄⠀⠀⠀⠀⢹⣿⣷⠀⠀\n" +
                "                                          ⠀⢠⣿⡿⠁⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀⠀⠀⠈⣿⣿⣿⠀⠀⠀ ⠀⠀⢹⣿⣧⠀\n" +
                "                                          ⠀⣾⣿⡇⠀⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀⠀⢀⣠⣿⣿⠟⠀⠀⠀⠀⠀ ⠈⣿⣿⠀\n" +
                "                                          ⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⢸⣿⣿⡿⠿⠿⠿⣿⣿⣥⣄⠀⠀⠀ ⠀⠀⠀⣿⣿⠀\n" +
                "                                          ⠀⢿⣿⡇⠀⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀⠀⠀⠀⢻⣿⣿⣧⠀⠀⠀ ⠀⢀⣿⣿⠀\n" +
                "                                          ⠀⠘⣿⣷⡀⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀⠀⠀⠀⣼⣿⣿⡿⠀⠀⠀ ⠀⣸⣿⡟⠀\n" +
                "                                          ⠀⠀⢹⣿⣷⡀⠀⠀⢰⣶⣿⣿⣿⣷⣶⣶⣾⣿⣿⠿⠛⠁⠀⠀⠀⣸⣿⡿⠀⠀\n" +
                "                                          ⠀⠀⠀⠹⣿⣷⣄⠀⠀⠀⠀⠀⣿⡇⠀⢸⣿⡇⠀⠀⠀⠀  ⠀⢀⣾⣿⠟⠁⠀⠀\n" +
                "                                          ⠀⠀⠀⠀⠘⢻⣿⣷⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⢀⣠⣾⣿⡿⠋⠀⠀⠀⠀\n" +
                "                                          ⠀⠀⠀⠀⠀⠀⠈⠛⢿⣿⣷⣶⣤⣤⣤⣤⣤⣤⣴⣾⣿⣿⠟⠋⠀⠀⠀⠀⠀⠀\n" +
                "                                          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠻⠿⠿⠿⠿⠟⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀  ";

        Artist =
                "\n" +
                "⠀⠀⠀⠀⠀⠀⠀                  ⠀⠀⠀⠀⠀⠀⠀⠀                        ⢀⡠⣄⡀⠀⠀⡠⠞⠛⢦⣠⢤⡀⠀\n" +
                "                                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⢠⠏⠀⠀⢱⡀⣸⠁⠀⡴⠋⠀⠀⣹⠀\n" +
                "                                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠋⠉⢿⢀⡤⠶⣴⠇⣯⠀⣼⠁⠀⢀⡴⠷⣄\n" +
                "                                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⠁⠀⣀⡾⠋⠀⠀⢹⣼⠁⢠⡇⠀⡴⠋⠀⠀⡼\n" +
                "                                         ⠀⠀⠀⠀⢠⠊⠑⢦⠀⡴⠋⢀⣠⠞⠉⠀⠀⠀⣠⣿⠧⣄⡾⠁⡼⠁⣀⣤⠾⡁\n" +
                "                                         ⠀⠀⠀⠀⢸⠀⠀⣨⠟⠁⢠⡞⠁⠀⠀⠀⣠⡾⠛⠁⠀⣿⠃⣰⠃⣴⠋⠀⠀⣷\n" +
                "                                         ⠀⠀⠀⠀⣸⢠⠞⠁⠀⢠⠏⠀⠀⢀⡴⠋⠁⠀⢀⣠⡴⠿⣶⡇⢰⠇⠀⠀⢠⠇\n" +
                "                                         ⠀⠀⠀⢠⢿⠏⠀⠀⠀⠉⠀⠀⣠⠞⠁⠀⡴⠚⠉⠁⠀⢀⡟⠀⣼⠀⠀⠀⢸⠀\n" +
                "                                         ⠀⠀⠀⡾⣼⢀⠀⠀⠀⠀⠀⠈⠉⠀⣠⠞⠁⠀⠀⢀⡴⠋⠙⢼⠃⠀⠀⠀⣸⠀\n" +
                "                                         ⠀⠀⠀⡇⠉⡎⠀⣰⠃⠀⠀⠀⠀⠀⠁⠀⠀⠀⡼⠉⠀⠀⠀⠘⠂⠀⠀⣠⠇⠀\n" +
                "                                         ⠀⠀⠀⡇⢸⠀⣰⠃⠀⡴⠀⠀⠀⠀⠀⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⣠⠖⠁⠀⠀\n" +
                "                                         ⠀⠀⢸⠁⡏⢠⠃⢀⠞⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⢀⣠⠖⠋⠁⠀⠀⠀⠀\n" +
                "                                         ⠀⠀⡞⠀⠃⡎⢀⠏⠀⠀⠀⠀⠀⠀⢀⡏⠀⣀⡤⠴⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                         ⡴⢺⠇⠀⠀⠀⠞⠀⠀⠀⠀⠀⠀⢀⡾⠒⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                         ⡇⠘⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                         ⢳⡀⠘⢦⡀⠀⠀⠀⠀⠀⠀⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                         ⠀⠳⣄⠀⠙⠲⣤⣀⣠⠴⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                         ⠀⠀⠈⠓⠦⣄⣀⡠⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        \n";

        DarkKing =
                "\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⣰⠂⠀⠀⠀⠀⠀⠄⢠⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⣳⣤⣤⣤⣦⣶⠟⠉⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⣀⡀⠀⢤⢴⣮⣿⣯⣿⡷⣻⠃⠀⠀⠀⠀⢀⣀⣤⠤⠒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣷⣤⢺⣿⡿⣟⣻⣿⣿⣍⠳⣢⣴⣾⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠻⣿⢘⢯⡁⠉⣹⣿⡿⡈⣻⣿⣿⠿⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣶⣯⣿⠼⠷⣿⢿⠿⢠⢷⢿⣛⣇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣟⣁⠌⢁⣴⣴⣶⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠀⠲⣤⣿⣿⣿⡿⣿⣿⣿⣿⣿⡿⣿⣿⡿⠟⡇⠀⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣷⣢⣵⡎⢙⡻⣿⣞⣽⣙⣻⣿⣿⣻⡿⣷⣧⣤⣧⣶⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⢪⣿⡝⣿⣿⣿⣿⣿⣿⣿⣷⣝⡿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠿⡹⢻⣇⠏⢀⣾⣿⣿⣿⣿⣿⣿⣻⡆⣿⢿⣿⢳⣍⣿⢿⠻⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⡟⣴⠁⠈⡘⣴⡟⣼⣿⣿⡾⣿⠃⠿⡄⣧⢸⡄⢹⢿⣿⣿⣄⠀⢹⡟⣽⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⡟⠠⠃⠀⢰⣿⣿⢧⢿⣿⣿⣿⣿⡌⠆⠃⢸⡆⣷⡟⠀⡹⢿⣿⣷⡀⠁⠉⣿⡹⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⠁⠀⠀⣰⣿⡟⢹⣳⣿⣿⡿⣿⣿⣻⡄⠀⠘⣿⢘⢷⠺⠃⠀⠻⣿⣿⡄⠀⢸⠀⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⠀⠀⣼⣿⠏⠀⣰⣿⣿⣿⣷⣿⣿⣧⢃⠀⠀⠈⠻⡈⢻⣆⠀⠀⠹⣿⣿⡄⠀⠀⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⠀⣸⣿⠋⠀⢠⣯⣿⣿⣿⣿⣿⠾⣿⣷⡂⠀⠀⠀⢣⠀⠱⡠⠀⠀⢹⣿⣧⠀⢸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⠀⣿⠃⠀⠀⣾⢿⣿⣿⣿⣿⣿⣼⣸⣿⣿⣦⠀⠀⠀⠆⠀⠱⡡⠀⠀⣿⣿⠀⣸⣿⠙⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⠀⣿⠀⠀⠀⡸⢨⣿⠏⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠰⠀⠀⢣⠃⠀⣿⣿⠀⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⠀⣿⢇⠀⠀⡇⠀⡏⠀⣿⣿⢿⣿⣿⣿⡟⣿⣿⣿⡀⠀⡇⠀⠈⡸⢾⣿⠇⠀⢻⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⢹⣾⡆⢠⡇⠀⢁⠀⣿⣿⣿⣿⣿⣿⣇⢻⣿⣿⣧⢀⠃⢠⣾⣴⢿⠏⠀⠀⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢏⠈⣡⠀⢸⠀⣿⣿⢻⣿⣿⣿⣿⡜⡿⡞⣿⣼⢔⣾⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠐⣻⠀⢠⠃⢹⡿⣼⣿⣿⣿⣿⣷⣽⡻⡘⣫⣼⣉⣥⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠠⠼⢒⣾⣷⡿⡿⣿⢼⣿⣿⣿⢹⣿⣣⢳⡌⢻⣻⣟⣑⡦⡶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠈⠙⠛⠛⠻⠿⠿⢿⣿⣿⡟⢻⡿⢺⠿⣿⣧⢻⡟⠛⠚⠁⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠛⠛⠋⠀⠈⠀⠚⠛⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n";

        PigparmCEO =
                "\n" +
                "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⡇⠀⠀⠀⠀⠀⠀⠀⢀⣠⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⠠⡄⣀⠀⠀⠀⠀⢰⠶⠆⠠⡄⡀⠀⢠⣿⣿⣿⡇⠀⣴⣾⣶⣾⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⢦⡀⠀⣑⠤⠀⠒⠚⠓⣄⠀⠀⠈⠲⡼⣿⣿⣿⣧⣼⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠜⣷⡏⠀⣠⠔⠉⠉⠀⠉⠻⣷⣄⠀⠘⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣥⣀⣿⡇⡔⠁⠀⠀⠀⠀⠀⠀⠘⣿⣷⡀⠀⠀⠈⢻⣿⣿⡛⠻⠿⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠀⢀⡀⣤⣀⠀⠀⠅⢀⣿⣿⢿⣁⣤⣶⠛⠛⠛⠛⠛⠻⠿⣿⣧⠀⠀⠀⠀⠹⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠀⣼⣿⣿⣿⣿⣦⡲⢤⡟⠁⢸⣯⣿⡿⠀⠀⠀⠀⠀⠀⠀⢀⠏⠀⠀⠀⠀⠀⢻⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣦⠙⢦⠀⠻⡟⠁⠀⠀⠀⠀⠀⠀⡠⠊⠀⠀⠀⠀⠀⠀⢸⣿⣿⡇⠳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⢣⠀⠣⠀⠈⠒⠤⠤⠤⠤⠒⠊⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⡷⠀⠩⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠸⣿⣿⣿⣿⣿⢿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⡇⠀⠀⢣⠀⢀⠀⣄⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⠃⠀⠀⢸⡄⠧⠾⣸⣰⠆⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠀⠀⠈⠉⠻⢍⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⠇⠀⠀⠀⠸⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠉⠢⢄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⢀⣀⣼⣿⡿⠃⠀⠀⠀⢀⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠃⢶⣤⣤⣄⣀⣀⣀⣸⣤⣤⣄⡀⠀⣼⣿⣿⣏⣀⠀⠀⠀⣠⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⡿⠛⠁⠀⢸⣿⣿⣿⣿⣿⠋⠉⢘⣿⣿⣿⡶⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠀⠀⠀⠈⠉⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n";







    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public void render() {

        initialize();

        User user = userService.findById(1L);

        if (user.getIntel() > 90 && user.getSociability() > 90 && user.getMorality() > 90 && user.getArtistry() > 90) {
            System.out.println(Line);
            System.out.println(King);
            System.out.println(Space + "딸이 자라서 왕이 되었습니다.");
            System.out.println(Line);
            SwingUtilities.invokeLater(() -> {
                new ImageDisplay("InsaengRPG/src/main/images/King.jpg", 400, 536).setVisible(true);
            });
        } else if (user.getWealth() > 90 && user.getMorality() > 20) {
            System.out.println(Line);
            System.out.println(Rich);
            System.out.println(Space + "딸이 자라서 재력가가 되었습니다.");
            System.out.println(Line);
            SwingUtilities.invokeLater(() -> {
                new ImageDisplay("InsaengRPG/src/images/Rich.jpg", 400, 536).setVisible(true);
            });
        } else if (user.getArtistry() > 70) {
            System.out.println(Line);
            System.out.println(Artist);
            System.out.println(Space + "딸이 자라서 예술가가 되었습니다.");
            System.out.println(Line);
            SwingUtilities.invokeLater(() -> {
                new ImageDisplay("InsaengRPG/src/images/Artist.jpg", 400, 536).setVisible(true);
            });
        } else if (user.getPTSD() > 80 && user.getMorality() < 20) {
            System.out.println(Line);
            System.out.println(DarkKing);
            System.out.println(Space + "딸이 자라서 마왕이 되었습니다.");
            System.out.println(Line);
            SwingUtilities.invokeLater(() -> {
                new ImageDisplay("src/images/King.jpg", 400, 536).setVisible(true);
            });
        } else {
            System.out.println(Line);
            System.out.println(PigparmCEO);
            System.out.println(Space + "딸이 자라서 돼지농장의 주인이 되었습니다.");
            System.out.println(Line);
            SwingUtilities.invokeLater(() -> {
                new ImageDisplay("InsaengRPG/src/images/PigparmCEO.jpg", 400, 536).setVisible(true);
            });
        }
    }

}