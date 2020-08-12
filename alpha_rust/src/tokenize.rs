pub fn tokenize(contents: &String) -> Vec<Vec<String>> {
    let mut tokenized: Vec<Vec<String>> = Vec::new();
    let mut command: Vec<String> = Vec::new();
    let mut token = String::new();
    let mut mode = "quote";
    let mut escaped = false;

    for c in contents.chars() {
        match c {
            '"' => {
                if escaped {
                    escaped = false;
                    token.push('"');
                } else if let "quote" = mode {
                    mode = "none";
                    command.push(token);
                    token = String::new()
                } else {
                    mode = "quote";
                }
            },
            ' ' => {
                if escaped {
                    escaped = false;
                } else if let "quote" = mode {
                    token.push(c);
                } else if token != "" {
                    command.push(token);
                    token = String::new();
                }
            },
            '.' => {
                if escaped {
                    escaped = false;
                    token.push('.');
                } else {
                    if token != "" {
                        command.push(token);
                        token = String::new();
                    }
                    tokenized.push(command);
                    command = Vec::new();
                }
            },
            '\\' => {
                if escaped {
                    escaped = false;
                    token.push('\\');
                } else {
                    escaped = true
                }
            },
            _ => {
                if escaped {
                    escaped = false
                } else {
                    token.push(c);
                }
            }
        }
    }

    tokenized
}
