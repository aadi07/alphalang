use std::env;
use std::fs;
use std::time::Instant;
use std::collections::HashMap;
mod tokenize;


fn main() {
    let args: Vec<String> = env::args().collect();
    let num_args = args.len();

    if num_args != 2 {
        panic!("Please provide only a single text file.");
    }

    let contents = fs::read_to_string(&args[1])
        .expect("Failed to read file.");

    let start = Instant::now();
    
    let tokenized = tokenize::tokenize(&contents);
    let mut variables = HashMap::new();

    for i in tokenized.iter() {
        if i[0] == "Print" {
            println!("{}", i[1]);
        } else if i[0] == "Assign" {
            variables.insert(&i[3], &i[1]);
        }
    }

    println!("Variables: {:?}", variables);

    let duration = start.elapsed();
    println!("Time: {:?}", duration);
}
