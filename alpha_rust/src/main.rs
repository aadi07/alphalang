use std::env;
use std::fs;
use std::time::Instant;


fn main() {
    let args: Vec<String> = env::args().collect();
    let num_args = args.len();
    let mut mode = "none";
    let mut escaped = false;
    let mut com_num = 1;

    if num_args != 2 {
        panic!("Please provide only a single text file.");
    }

    let contents = fs::read_to_string(&args[1])
        .expect("Failed to read file.");

    let start = Instant::now();
    let mut cur_word = String::new();
    let mut strings: Vec<String> = Vec::new();
    let mut command_types: Vec<String> = Vec::new();
    let mut command_words = String::new();
    let mut new_command = true;

    for c in contents.chars() {
        match c {
            '"' => {
                if escaped {
                    escaped = false;
                    cur_word.push('"');
                    display(&mode, c, com_num);
                } else if let "quote" = mode {
                    mode = "none";
                    strings.push(cur_word);
                    cur_word = String::new()
                } else {
                    mode = "quote";
                }
            },
            ' ' => {
                if escaped {
                    escaped = false;
                } else if let "quote" = mode {
                    cur_word.push(c);
                    display(&mode, c, com_num);
                } else {
                    new_command = false;
                    display(&mode, c, com_num);
                }
            },
            '.' => {
                if escaped {
                    escaped = false;
                    cur_word.push('.');
                    display(&mode, c, com_num);
                } else {
                    com_num += 1;
                    command_types.push(cur_command_type);
                    new_command = true;
                    escaped = true;
                    cur_command_type = String::new()
                }
            },
            '\\' => {
                if escaped {
                    escaped = false;
                    cur_word.push('\\');
                    display(&mode, c, com_num);
                } else {
                    escaped = true
                }
            },
            _ => {
                if escaped {
                    escaped = false
                } else {
                    if let "quote" = mode {
                        cur_word.push(c);
                    } else if new_command {
                        cur_command_type.push(c);
                    }
                    display(&mode, c, com_num);
                }
            }
        }
    }

    println!("{:?}", strings);
    println!("{}", contents);
    println!("{:?}", command_types);

    let duration = start.elapsed();
    println!("Time: {:?}", duration);
}

fn display(mode: &str, c: char, num: u32) {
    println!("{}: \"{}\" mode >> {}", num, mode, c);
}
