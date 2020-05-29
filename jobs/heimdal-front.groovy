project_name = "heimdalfront"
repo = "https://github.com/Teloggy/Heimdal-Front.git"
repo_name = "heimdalfront"

pipelineJob (project_name){
    definition{
	triggers{
	    scm('* * * * *')
	}
	cpsScm{
	    scm{
		git{    		    
		    remote{
			name(repo_name)
			url(repo)
			refspec(null)
		        credentials('yaher-teloggy-easy')
		    }
		    branches('master')		    
                }
		scriptPath("Jenkinsfile")
	    }
	}
    }
}